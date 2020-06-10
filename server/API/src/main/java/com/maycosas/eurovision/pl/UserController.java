package com.maycosas.eurovision.pl;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.maycosas.eurovision.bll.UserService;
import com.maycosas.eurovision.bll.VoteService;
import com.maycosas.eurovision.entities.User;
import com.maycosas.eurovision.entities.Vote;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.io.PrintWriter;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private VoteService voteService;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/user/")
	/**
	 * 
	 * @return JSON with User data
	 */
	public Object getUsers() {
		try {
			return userService.getAllUsers();
		} catch (NoSuchElementException nsee) {
			// HTTP 404
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// HTTP 500
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/user/")
	/**
	 * 
	 * @param name
	 * @return Create a new user
	 */
	public Object createUser(@RequestParam(value = "name", required = true) String name) {
		try {
			return userService.createUser(name); // No tiene en cuenta si el nombre se repite, para que se pueda votar varias veces con el mismo nombre en las diferentes galas
		} catch (NoSuchElementException nsee) {
			// HTTP 404
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// HTTP 500
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/user/{id}")
	/**
	 * 
	 * @param id
	 * @return Specific User data
	 */
	public Object getUser(@PathVariable String id) {
		try {
			return userService.getUser(Integer.parseInt(id));
		} catch (NoSuchElementException nsee) {
			// HTTP 404
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// HTTP 500
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/user/{id}/vote")
	/**
	 * 
	 * @param id
	 * @param participant1
	 * @param participant2
	 * @param participant3
	 * @param gala
	 * @return Create new Votes into an specific user
	 */
	public Object vote(@PathVariable String id, @RequestParam(value = "vote1", required = true) int participant1,
			@RequestParam(value = "vote2", required = true) int participant2,
			@RequestParam(value = "vote3", required = true) int participant3,
			@RequestParam(value = "gala", required = true) int gala) {
		try {
			User user = userService.getUser(Integer.parseInt(id));
			Timestamp date = new Timestamp(System.currentTimeMillis());

			if (user.getVotos().size() == 0) {
				Vote vote1 = new Vote(participant1, user.getId(), 0, gala, date);
				voteService.saveVote(vote1);
				Vote vote2 = new Vote(participant2, user.getId(), 1, gala, date);
				voteService.saveVote(vote2);
				Vote vote3 = new Vote(participant3, user.getId(), 2, gala, date);
				voteService.saveVote(vote3);

				ArrayList<Vote> votes = new ArrayList<Vote>();
				votes.add(vote1);
				votes.add(vote2);
				votes.add(vote3);

				user.setVotos(votes);

				return user;

			} else {
				// HTTP 409
				return new ResponseEntity<>(HttpStatus.CONFLICT);
			}

		} catch (NoSuchElementException nsee) {
			// HTTP 404
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// HTTP 500
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
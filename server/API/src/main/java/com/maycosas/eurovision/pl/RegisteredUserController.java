package com.maycosas.eurovision.pl;

import java.io.PrintWriter;
import java.io.StringWriter;
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

import com.maycosas.eurovision.bll.FavoritesService;
import com.maycosas.eurovision.bll.RegisteredUserService;
import com.maycosas.eurovision.entities.Favorites;
import com.maycosas.eurovision.entities.RegisteredUser;

@RestController
public class RegisteredUserController {

	@Autowired
	private RegisteredUserService ruserService;
	@Autowired
	private FavoritesService favService;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/registered_user/")
	public Object getRegisteredUsers() {
		try {
			return ruserService.getAllRegisteredUsers();
		} catch (NoSuchElementException nsee) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/registered_user/")
	public Object createRegisteredUser(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "password", required = true) String password) {
		try {
			if (ruserService.getRegisteredUsername(username) == null
					&& ruserService.getRegisteredPassword(password) == null) {
				return ruserService.createRegisteredUser(username, password);
			} else {
				return new ResponseEntity<>(HttpStatus.CONFLICT);
			}

		} catch (NoSuchElementException nsee) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/registered_user/{id}")
	public Object getRegisteredUser(@PathVariable String id) {
		try {
			return ruserService.getRegisteredUser(Integer.parseInt(id));
		} catch (NoSuchElementException nsee) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			// TODO: handle exception
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/registered_user/{id}/favorites")
	public Object favorites(@PathVariable String id, @RequestParam(value = "favorite1", required = true) int favorite1,
			@RequestParam(value = "favorite2", required = true) int favorite2,
			@RequestParam(value = "favorite3", required = true) int favorite3) {
		try {
			RegisteredUser user = ruserService.getRegisteredUser(Integer.parseInt(id));

			if (user.getFavorites().size() == 0) {
				Favorites fav1 = new Favorites(favorite1, user.getId());
				favService.saveFavorites(fav1);
				Favorites fav2 = new Favorites(favorite2, user.getId());
				favService.saveFavorites(fav2);
				Favorites fav3 = new Favorites(favorite3, user.getId());
				favService.saveFavorites(fav3);

				ArrayList<Favorites> favorites = new ArrayList<Favorites>();
				favorites.add(fav1);
				favorites.add(fav2);
				favorites.add(fav3);

				user.setFavorites(favorites);

				return user;

			} else {
				// Devuelve un 409
				return new ResponseEntity<>(HttpStatus.CONFLICT);

			}

		} catch (NoSuchElementException nsee) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String sStackTrace = sw.toString();

			return new ResponseEntity<>(sStackTrace, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}

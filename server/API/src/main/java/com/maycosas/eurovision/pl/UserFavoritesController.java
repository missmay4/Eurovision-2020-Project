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
import com.maycosas.eurovision.bll.UserFavoritesService;
import com.maycosas.eurovision.entities.Favorites;
import com.maycosas.eurovision.entities.UserFavorites;

@RestController
public class UserFavoritesController {

	@Autowired
	private UserFavoritesService userFService;
	@Autowired
	private FavoritesService favService;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/user_favorites/")
	/**
	 * 
	 * @return JSON with User who saved favorites
	 */
	public Object getUserFavorites() {
		try {
			return userFService.getAllUsersFavorites();
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
	@PostMapping("/user_favorites/")
	/**
	 * 
	 * @param username
	 * @param country
	 * @return Create new user to save favorites
	 */
	public Object createUserFavorites(@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "country", required = true) String country) {
		try {
			if (userFService.getFavoritesUsername(username) == null
					&& userFService.getFavoritesCountry(country) == null) {
				return userFService.createUserFavorites(username, country);
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

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/user_favorites/{id}")
	/**
	 * 
	 * @param id
	 * @return Specific User with favorites data
	 */
	public Object getUserFavorites(@PathVariable String id) {
		try {
			return userFService.getUserFavorites(Integer.parseInt(id));
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
	@PostMapping("/user_favorites/{id}/favorites")
	/**
	 * 
	 * @param id
	 * @param favorite1
	 * @param favorite2
	 * @param favorite3
	 * @param favorite4
	 * @param favorite5
	 * @param favorite6
	 * @param favorite7
	 * @param favorite8
	 * @param favorite9
	 * @param favorite10
	 * @return Create new Favorites into an specific user with favorites
	 */
	public Object saveFavorites(@PathVariable String id,
			@RequestParam(value = "favorite1", required = true) int favorite1,
			@RequestParam(value = "favorite2", required = true) int favorite2,
			@RequestParam(value = "favorite3", required = true) int favorite3,
			@RequestParam(value = "favorite4", required = true) int favorite4,
			@RequestParam(value = "favorite5", required = true) int favorite5,
			@RequestParam(value = "favorite6", required = true) int favorite6,
			@RequestParam(value = "favorite7", required = true) int favorite7,
			@RequestParam(value = "favorite8", required = true) int favorite8,
			@RequestParam(value = "favorite9", required = true) int favorite9,
			@RequestParam(value = "favorite10", required = true) int favorite10) {
		try {
			UserFavorites user = userFService.getUserFavorites(Integer.parseInt(id));

			if (user.getFavorites().size() == 0) {
				Favorites fav1 = new Favorites(favorite1, user.getId());
				favService.saveFavorites(fav1);
				Favorites fav2 = new Favorites(favorite2, user.getId());
				favService.saveFavorites(fav2);
				Favorites fav3 = new Favorites(favorite3, user.getId());
				favService.saveFavorites(fav3);
				Favorites fav4 = new Favorites(favorite4, user.getId());
				favService.saveFavorites(fav4);
				Favorites fav5 = new Favorites(favorite5, user.getId());
				favService.saveFavorites(fav5);
				Favorites fav6 = new Favorites(favorite6, user.getId());
				favService.saveFavorites(fav6);
				Favorites fav7 = new Favorites(favorite7, user.getId());
				favService.saveFavorites(fav7);
				Favorites fav8 = new Favorites(favorite8, user.getId());
				favService.saveFavorites(fav8);
				Favorites fav9 = new Favorites(favorite9, user.getId());
				favService.saveFavorites(fav9);
				Favorites fav10 = new Favorites(favorite10, user.getId());
				favService.saveFavorites(fav10);

				ArrayList<Favorites> favorites = new ArrayList<Favorites>();
				favorites.add(fav1);
				favorites.add(fav2);
				favorites.add(fav3);
				favorites.add(fav4);
				favorites.add(fav5);
				favorites.add(fav6);
				favorites.add(fav7);
				favorites.add(fav8);
				favorites.add(fav9);
				favorites.add(fav10);

				user.setFavorites(favorites);

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

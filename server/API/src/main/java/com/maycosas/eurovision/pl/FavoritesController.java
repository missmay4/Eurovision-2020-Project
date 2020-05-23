package com.maycosas.eurovision.pl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maycosas.eurovision.bll.FavoritesService;

@RestController
public class FavoritesController {
	@Autowired
	private FavoritesService favoriteService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/favorites/")
	public Object getAllFavorites() {
		try {
			return favoriteService.getFavorites();
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

}

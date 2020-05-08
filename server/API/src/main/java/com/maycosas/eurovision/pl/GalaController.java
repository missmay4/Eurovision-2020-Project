package com.maycosas.eurovision.pl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maycosas.eurovision.bll.GalaService;

@RestController
public class GalaController {
	
	@Autowired
	private GalaService galaService;
	
	@GetMapping("/gala/")
	public Object getGalas() {
		try {
			return galaService.getAll();
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

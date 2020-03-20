package com.maycosas.eurovision.pl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maycosas.eurovision.bll.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countriesService;

	@GetMapping("/country/")
	public Object getCountries() {
		try {
			return countriesService.getAllCountries();
		} catch (NoSuchElementException nsee) {
			// TODO devolver un HTTP 404
			return null;
		} catch (Exception e) {
			// TODO devolver un HTTP 500
			return null;
		}

	}
}
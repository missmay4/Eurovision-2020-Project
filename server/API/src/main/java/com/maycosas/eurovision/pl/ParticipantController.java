package com.maycosas.eurovision.pl;

import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.maycosas.eurovision.bll.ParticipantService;

@RestController
public class ParticipantController {

	@Autowired
	private ParticipantService participantService;

	@CrossOrigin()
	@GetMapping("/participant/")
	public Object getParticipants() {
		try {
			return participantService.getAllParticipants();

		} catch (NoSuchElementException nsee) {
			// TODO devolver un HTTP 404
			return null;
		} catch (Exception e) {
			// TODO devolver un HTTP 500
			System.out.println(e);
			return null;
		}
	}

}

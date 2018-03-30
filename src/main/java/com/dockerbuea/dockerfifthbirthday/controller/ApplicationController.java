package com.dockerbuea.dockerfifthbirthday.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApplicationController {

	@GetMapping(
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<String> initialize() {
		return new ResponseEntity<>("Happy fifth birthday Docker. :)", HttpStatus.OK);
	}

	@GetMapping(
			path = "/welcome",
			produces = MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<>("Welcome to Docker's fifth birthday. \\~/", HttpStatus.OK);
	}

}

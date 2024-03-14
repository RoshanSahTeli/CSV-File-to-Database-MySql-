package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.service.appService;
import com.opencsv.exceptions.CsvException;

@RestController
public class appController {
	@Autowired
	private appService service;
	
	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) throws IOException, CsvException{
		service.save(file);
		return ResponseEntity.status(HttpStatus.OK).body("uploaded Successfully");
	}

}

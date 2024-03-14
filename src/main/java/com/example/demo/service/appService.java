package com.example.demo.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Repository.appRepository;
import com.example.demo.entity.employee;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@Component
public class appService {
	
	@Autowired
	private appRepository repo;
	
	private final String path="C:\\Users\\rajes\\OneDrive\\Desktop\\";
	
	public void save(MultipartFile file) throws IOException, CsvException {
		CSVReader reader=new CSVReader(new FileReader(path+file.getOriginalFilename()));
		List<String[]>rows=reader.readAll();
		List<employee> elist=new ArrayList<>();
		
		for(String[] row:rows) {
			employee e= new employee();
			
			e.setId(row[1]);
			e.setFname(row[2]);
			e.setLname(row[3]);
			e.setCompany(row[4]);
			e.setCity(row[5]);
			
			elist.add(e);
		}
		repo.saveAll(elist);
	}

}

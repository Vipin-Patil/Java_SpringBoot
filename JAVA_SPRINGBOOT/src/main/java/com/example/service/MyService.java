package com.example.service;

import java.util.List;
import com.example.model.*;
import org.springframework.http.ResponseEntity;

public interface MyService {
	
	public ResponseEntity<Model> insert(Model model);
	
	public ResponseEntity<Model> update(Model model);
	
	public ResponseEntity<Void> deleteAll();
	
	public ResponseEntity<Void> deleteById(int id);
	
	public ResponseEntity<List<Model>> getAllData();
	
	public ResponseEntity<Model> findById(int id);
	
}

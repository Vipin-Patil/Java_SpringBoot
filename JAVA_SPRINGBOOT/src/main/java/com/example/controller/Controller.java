package com.example.controller;

import com.example.model.Model;
import com.example.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	MyService myservice ;
	
	//For inserting Data//
	@PostMapping("/insert")
	private ResponseEntity<Model> save(@RequestBody Model model) {
		return myservice.insert(model);
	}
	
	//For updating Data//
	@PutMapping("/update")
	private ResponseEntity<Model> update(@RequestBody Model model) {
		return myservice.update(model);
	}
	//For Deleting Data//
	@DeleteMapping("/deleteall")
	private ResponseEntity<Void> delete(){
		return myservice.deleteAll();
	}
	
	//For Deleting by ID//
	@DeleteMapping("/deletebyid/{id}")
	private ResponseEntity<Void> deletebyid(@PathVariable("id") int id ) {
		return myservice.deleteById(id);
	}
	
	//For getting all data//
	@GetMapping("/getalldata")
	private ResponseEntity<List<Model>> getAllData(){
		return myservice.getAllData() ;
	}
	
	//For getting Data by id//
	@GetMapping("/findbyid/{id}")
	private ResponseEntity<Model> findById(@PathVariable("id") int id) {
		return myservice.findById(id);
	}
}

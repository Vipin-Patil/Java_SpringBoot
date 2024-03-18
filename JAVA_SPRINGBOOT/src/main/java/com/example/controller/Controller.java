package com.example.controller;

import com.example.model.Model;
import com.example.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	MyService myservice ;
	
	//For inserting Data//
	@PostMapping("/insert")
	private Integer save(@RequestBody Model model) {
		myservice.insert(model) ;
		return model.getId() ;
	}
	
	//For updating Data//
	@PostMapping("/update")
	private Model update(@RequestBody Model model) {
		myservice.insert(model);
		return model ;
	}
	//For Deleting Data//
	@DeleteMapping("/deleteall")
	private void delete(){
		myservice.delete();
	}
	
	//For Deleting by ID//
	@DeleteMapping("/deletebyid/{id}")
	private void deletebyid(@PathVariable("id") int id ) {
		myservice.deletebyid(id);
	}
	
	//For getting all data//
	@GetMapping("/getalldata")
	private List<Model> getalldata(){
		return myservice.getalldata() ;
	}
	
	//For getting Data by id//
	@GetMapping("/findbyid/{id}")
	private Model findbyid(@PathVariable("id") int id) {
		return myservice.findbyyid(id);
	}
}

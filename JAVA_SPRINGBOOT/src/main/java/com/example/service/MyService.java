package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.repository.*;



import com.example.model.*;

@Service
public class MyService {
	
	@Autowired
	DAO dao ;
	
	//For inserting Data//
	public ResponseEntity<Model> insert(Model model) {
		try {
			dao.save(model) ; 
			return new ResponseEntity<Model>(model,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<Model>(model,HttpStatus.BAD_REQUEST);
		}
	}
	
	//For updating Data//
	public ResponseEntity<Model> update(Model model) {
		try {
			dao.save(model) ; 
			return new ResponseEntity<Model>(model,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<Model>(model,HttpStatus.BAD_REQUEST);
		}
	}
	
	//For Deleting by Data//
	public ResponseEntity<Void> deleteAll() {
		try {
			dao.deleteAll();
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//For Deleting Data by ID//
	public ResponseEntity<Void> deleteById(int id) {
		try {
			dao.deleteById(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//For getting all data//
	public ResponseEntity<List<Model>> getAllData(){
		List<Model> modelList = new ArrayList<Model>() ;
		try {
			modelList = (List<Model>) dao.findAll();
			return new ResponseEntity<List<Model>>(modelList,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<List<Model>>(modelList,HttpStatus.BAD_REQUEST);
		}
	}
	
	//For getting Data by id//
	public ResponseEntity<Model> findById(int id){
		Model model = null;
		try {
			model = dao.findById(id).get();
			return new ResponseEntity<Model>(model,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Model>(model,HttpStatus.BAD_REQUEST);
		}
	}
}

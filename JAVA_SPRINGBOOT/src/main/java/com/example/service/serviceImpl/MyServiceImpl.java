package com.example.service.serviceImpl;

import java.util.List;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.repository.*;
import com.example.model.*;
import com.example.service.MyService;

@Service
public class MyServiceImpl implements MyService {
	
	@Autowired
	DAO dao ;
	
	//For inserting Data//
	@Transactional
	public ResponseEntity<Model> insert(Model model) {
		try {
			for(int i = 1 ; i < 100 ; i++) {
				String name = "TestUser" + i;
				String profession = "TestProfession" + i;
				model.setName(name);
				model.setProfession(profession);
				dao.save(model);
//				if(i == 99) {
//					throw new Error();
//				}
			}
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

package com.example.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.*;



import com.example.model.*;

@Service
public class MyService {
	
	@Autowired
	DAO dao ;
	
	//For inserting Data//
	public void insert(Model model) {
		dao.save(model) ; 
	}
	
	//For updating Data//
	public void update(Model model) {
		dao.save(model);
	}
	
	//For Deleting by Data//
	public void delete() {
		dao.deleteAll();
	}
	
	//For Deleting Data by ID//
	public void deletebyid(int id) {
		dao.deleteById(id);
	}
	
	//For getting all data//
	public List<Model> getalldata(){
		List<Model> model = new ArrayList<Model>() ;
		dao.findAll().forEach(model1 -> model.add(model1));
		return model ;
	}
	
	//For getting Data by id//
	public Model findbyyid(int id){
		return dao.findById(id).get() ;
	}
}

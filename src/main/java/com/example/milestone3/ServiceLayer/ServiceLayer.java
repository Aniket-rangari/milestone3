package com.example.milestone3.ServiceLayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.milestone3.entity.University;
import com.example.milestone3.repository.repo;


@Service
public class ServiceLayer {
	
	@Autowired
	private repo repository;
	
	public University addUniversity(University uni) {
		return repository.save(uni);
	}
	
	public University getuniversity(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<University> getAllUniversity(){
		return repository.findAll();
	}
	
	public String deleteUniversity(int id) {
		repository.deleteById(id);
		return "university deleted, Id : " +id ;
	}
	
    public University editUniversity(University u) {
		
		University a = repository.findById(u.getId()).orElse(null);
		a.setName(u.getName());
		a.setNumberofcollege(u.getNumberofcollege());
		return a;
	}
	

}

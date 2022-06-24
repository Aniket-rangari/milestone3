package com.example.milestone3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.milestone3.ServiceLayer.ServiceLayer;
import com.example.milestone3.entity.University;

@RestController
public class ControllerLayer {

	@Autowired
	private ServiceLayer service;
	
	@PostMapping("/universities")
	public University addUniversity(@RequestBody University u) {
		return service.addUniversity(u);
	}
	
	@GetMapping("/universities/{id}")
	public University getById(@PathVariable int id) {
		return service.getuniversity(id);	
	}
	
	@GetMapping("/universities")
	public List<University> getByList(){
		return service.getAllUniversity();
	}
	
	@PutMapping("/universities")
	public University editUniversity(@RequestBody University u) {
		return service.editUniversity(u);
	}
	
	@DeleteMapping("/universiteis/{id}")
	public String deleteUniversity(@PathVariable int id) {
		return service.deleteUniversity(id);
	}
}

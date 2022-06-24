package com.example.milestone3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.milestone3.entity.University;

@Repository
public interface repo extends JpaRepository<University,Integer>{

}


  package com.example.demo; import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO;
import com.example.demo.model.Societe;
  
  @RestController 
  @RequestMapping("/api")
  public class BourseRestService {
	  
	  
@Autowired  
  DAO dao;
  @Value("${me}") private String me;
  
  @RequestMapping("/messages") public String me() {
  System.out.println("-------------------------------------");
  System.out.println("c est moi qui répond");
  System.out.println("-------------------------------------");
  
  return me; }
  
  @GetMapping("/societes")
  List <Societe> liste()
  {
	  
	  return dao.findAll();
  }
  
  }
 
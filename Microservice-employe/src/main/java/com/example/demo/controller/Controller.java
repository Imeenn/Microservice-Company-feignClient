package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.SocieteBean;
import com.example.demo.proxies.MicroserviceSocieteProxy;

@RestController
public class Controller {
	
	
	
	 @Autowired
	 private MicroserviceSocieteProxy SocietesProxy;
	
	 @GetMapping("/societes")
	  List <SocieteBean> liste()
	  {
		 
		 return SocietesProxy.liste();
		 
	  }

}

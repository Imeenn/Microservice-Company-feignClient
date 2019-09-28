package com.example.demo.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.beans.SocieteBean;

@FeignClient(name = "service-societe", url = "localhost:8080")
public interface MicroserviceSocieteProxy {
	
	 @GetMapping("/api/societes")
	  List <SocieteBean> liste();

}

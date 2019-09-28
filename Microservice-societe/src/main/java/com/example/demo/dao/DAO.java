package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Societe;
@RestResource
public interface DAO  extends MongoRepository<Societe, Integer>{

}

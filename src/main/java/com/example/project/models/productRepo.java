package com.example.project.models;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface productRepo extends CrudRepository<product, String>{

}

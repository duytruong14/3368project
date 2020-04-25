package com.example.project.models;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface transactionRepo extends CrudRepository<transaction, UUID>{

}

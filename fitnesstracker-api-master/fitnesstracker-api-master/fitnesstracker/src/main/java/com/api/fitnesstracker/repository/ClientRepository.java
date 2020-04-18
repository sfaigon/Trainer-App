package com.api.fitnesstracker.repository;

import com.api.fitnesstracker.dbmgmt.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
    Client findByEmail(String email);
//    Client findAllByTrainer_id(String trainer_id);
}

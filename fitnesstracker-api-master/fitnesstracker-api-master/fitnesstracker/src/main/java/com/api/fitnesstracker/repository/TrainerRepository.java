package com.api.fitnesstracker.repository;

import com.api.fitnesstracker.dbmgmt.Trainer;

import org.springframework.data.repository.CrudRepository;
public interface TrainerRepository extends CrudRepository<Trainer, String> {
    Trainer findByEmail(String email);
}


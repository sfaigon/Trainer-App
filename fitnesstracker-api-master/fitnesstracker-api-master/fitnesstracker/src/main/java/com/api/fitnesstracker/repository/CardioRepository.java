package com.api.fitnesstracker.repository;

import com.api.fitnesstracker.dbmgmt.exercise_strength_training;

import org.springframework.data.repository.CrudRepository;
public interface CardioRepository extends CrudRepository<CardioExercise, String> {
    CardioExercise findByName(String name);
}
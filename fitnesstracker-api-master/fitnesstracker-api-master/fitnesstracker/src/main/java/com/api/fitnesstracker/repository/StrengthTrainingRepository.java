package com.api.fitnesstracker.repository;

import com.api.fitnesstracker.dbmgmt.exercise_cardio;

import org.springframework.data.repository.CrudRepository;
public interface StrengthTrainingRepository extends CrudRepository<StrengthExercise, String> {
    StrengthExercise findByName(String name);
}
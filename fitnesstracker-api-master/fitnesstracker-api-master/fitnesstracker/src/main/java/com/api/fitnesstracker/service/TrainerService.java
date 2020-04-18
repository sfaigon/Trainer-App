package com.api.fitnesstracker.service;

import com.api.fitnesstracker.dbmgmt.Client;
import com.api.fitnesstracker.dbmgmt.Trainer;
import com.api.fitnesstracker.repository.ClientRepository;
import com.api.fitnesstracker.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;

//    @Autowired
//    private ClientRepository clientRepository;

    //registration for trainer
    public Boolean registerClient(String email, String first_name, String last_name, String phone_number, String tr_password) {
        try {
            trainerRepository.save(new Trainer(email, first_name, last_name, phone_number, tr_password));
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    //login for trainer
    public Trainer getTrainer(String email, String tr_password) {
        Trainer t;

        try {
            t = trainerRepository.findByEmail(email);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "", e);
        }

        if(!tr_password.equals(t.getTr_password())) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        }

        return t;
    }

    //add excercise
    public Boolean addStrengthExercise(String name, String primary_muscle_group, String secondary_muscle_group) {
        try {
           .save(new exercise_strength_training(name, primary_muscle_group, secondary_muscle_group));
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    public Boolean addCardioExercise(String name, String primary_muscle_group, String secondary_muscle_group) {
        try {
           StrengthTrainingRepository.save(new exercise_strength_training(name, primary_muscle_group, secondary_muscle_group));
        } catch(Exception e) {
            return false;
        }
        return true;
    }


//    //retrieve client list
//    public List<Client> getClientList(String trainer_id) {
//        List<Client> clientList;
//        clientList = (List<Client>) clientRepository.findAllByTrainer_id(trainer_id);
//        return clientList;
//    }

}
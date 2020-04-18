package com.api.fitnesstracker.controller;
import com.api.fitnesstracker.dbmgmt.Trainer;
import com.api.fitnesstracker.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trainer")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @RequestMapping("/register")
    public @ResponseBody Boolean registerTrainer(@RequestParam String email, @RequestParam String first_name, @RequestParam String last_name, @RequestParam String phone_number, @RequestParam String tr_password) {
        return trainerService.registerClient(email, first_name, last_name, phone_number, tr_password);
    }

    @RequestMapping("/login")
    public Trainer getTrainer(@RequestParam String email, @RequestParam String tr_password) {
        return trainerService.getTrainer(email, tr_password);
    }
    @RequestMapping("/api/exercise_strength_training")
    public @ResponseBody Boolean addStrengthExercise(@RequestParam String name, @RequestParam String primary_muscle_group, @RequestParam String secondary_muscle_group){
        return trainerService.addStrengthExercise(name, primary_muscle_group, secondary_muscle_group);
    }
    @RequestMapping("/api/exercise_cardio")
    public @ResponseBody Boolean addCardioExercise(@RequestParam String name, @RequestParam String primary_muscle_group, @RequestParam String secondary_muscle_group){
        return trainerService.addCardioExercise(name, primary_muscle_group, secondary_muscle_group);
    }

}




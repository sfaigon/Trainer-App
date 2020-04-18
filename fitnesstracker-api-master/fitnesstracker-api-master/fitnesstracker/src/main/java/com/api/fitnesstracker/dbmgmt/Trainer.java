package com.api.fitnesstracker.dbmgmt;

import javax.persistence.*;

@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trainer_id;

    private String email;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String tr_password;

    public Trainer(String email, String first_name, String last_name, String phone_number, String tr_password) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.tr_password = tr_password;
    }

    public Trainer() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getTr_password() {
        return tr_password;
    }

    public void setTr_password(String tr_password) {
        this.tr_password = tr_password;
    }





}
package com.api.fitnesstracker.dbmgmt;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int client_id;

    private String email;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String cl_password;
//    private String trainer_id;

    public Client(String email, String first_name, String last_name, String phone_number, String cl_password) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.cl_password = cl_password;
    }

    public Client() {

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

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getCl_password() {
        return cl_password;
    }

    public void setCl_password(String cl_password) {
        this.cl_password = cl_password;
    }

//    public String getTrainer_id() {
//        return trainer_id;
//    }
//
//    public void setTrainer_id(String trainer_id) {
//        this.trainer_id = trainer_id;
//    }

}


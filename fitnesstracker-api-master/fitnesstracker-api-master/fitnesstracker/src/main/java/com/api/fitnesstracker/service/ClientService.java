package com.api.fitnesstracker.service;

import com.api.fitnesstracker.dbmgmt.Client;
import com.api.fitnesstracker.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    //registration for client
    public Boolean registerClient(String email, String first_name, String last_name, String phone_number, String cl_password) {
        try {
            clientRepository.save(new Client(email, first_name, last_name, phone_number, cl_password));
        } catch(Exception e) {
            return false;
        }
        return true;
    }

    //login for client
    public Client getClient(String email, String cl_password) {
        Client c;

        try {
            c = clientRepository.findByEmail(email);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "", e);
        }

        if(!cl_password.equals(c.getCl_password())) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
        }

        return c;
    }

}

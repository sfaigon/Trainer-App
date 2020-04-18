package com.api.fitnesstracker.controller;


import com.api.fitnesstracker.dbmgmt.Client;
import com.api.fitnesstracker.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("/register")
    public @ResponseBody Boolean registerClient(@RequestParam String email, @RequestParam String first_name, @RequestParam String last_name, @RequestParam String phone_number, @RequestParam String cl_password) {
        return clientService.registerClient(email, first_name, last_name, phone_number, cl_password);
    }

    @RequestMapping("/login")
    public Client getClient(@RequestParam String email, @RequestParam String cl_password) {
        return clientService.getClient(email, cl_password);
    }
}

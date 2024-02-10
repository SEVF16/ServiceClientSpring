package com.service.client.springboot.web.service.controller;

import com.service.client.springboot.web.service.domain.Client;
import com.service.client.springboot.web.service.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
   private ClientService clientService;
    @GetMapping("/allclient")
    public List<Client> getAll(){
        return clientService.getAll();
    }
}

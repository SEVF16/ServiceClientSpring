package com.service.client.springboot.web.service.domain.service;

import com.service.client.springboot.web.service.domain.Client;
import com.service.client.springboot.web.service.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }
}

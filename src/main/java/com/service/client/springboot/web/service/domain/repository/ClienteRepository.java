package com.service.client.springboot.web.service.domain.repository;

import java.util.List;


import com.service.client.springboot.web.service.domain.Client;
import com.service.client.springboot.web.service.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.service.client.springboot.web.service.persistence.crud.ClienteCrudRepository;
import com.service.client.springboot.web.service.persistence.entity.Cliente;


@Repository
public class ClienteRepository implements  ClientRepository{
	@Autowired
	private ClienteCrudRepository clienteCrudRepository;
	@Autowired
	private ClientMapper mapper;
	@Override
	public List<Client> getAll(){
		List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();

        return mapper.toClient(clientes);
	}
	

}

package com.service.client.springboot.web.service.domain.repository;

import java.util.List;

import com.service.client.springboot.web.service.domain.Client;

public interface ClientRepository {
	List<Client> getAll();
}

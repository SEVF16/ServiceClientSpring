package com.service.client.springboot.web.service.persistence.crud;

import java.util.List;


import com.service.client.springboot.web.service.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Long>{

	List<Cliente> findByid(Long id);
}

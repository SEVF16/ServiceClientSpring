package com.service.client.springboot.web.service.persistence.mapper;

import com.service.client.springboot.web.service.domain.Client;
import com.service.client.springboot.web.service.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);
    @Mappings({
            @Mapping(source = "id", target = "clientid"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "correoElectronico", target = "email"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "rut", target = "clienRut"),
            @Mapping(source = "comunaId", target = "comunaIdFk"),
    })

    Client toClient(Cliente cliente);
    List<Client> toClient(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mapping(target = "id",  ignore = true)
    Cliente toCliente(Client client);


}

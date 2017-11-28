package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Client;

@Mapper(componentModel="spring")

public interface ClientMapper {

		Client fromDto(ClientDto dto);
		
		List<Client> fromDtos(List<ClientDto> dtos);
		
		ClientDto toDto(Client Client);
		
		List<ClientDto> toDto(List<Client> Client);
		
	}

}

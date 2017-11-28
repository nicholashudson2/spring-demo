package com.example.demo.service;

import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Client;
import com.example.demo.mapper.ClientMapper;
import com.example.demo.repository.ClientRepository;

public class ClientService {

	private ClientRepository clientRepository;
	private ClientMapper clientMapper;

	public ClientService(ClientRepository clientRepository, ClientMapper clientMapper) {
			this.clientRepository = clientRepository;
			this.clientMapper = clientMapper;
		}

	@Transactional
	public ClientDto createClient(ClientDto clientDto) {
		Client client = new Client();
		client.setActive(true);
		//TODO: ADD LOGIC
		return clientMapper.toDto(clientRepository.save(client));
	}

	public ClientDto findById(long id) {
		return clientMapper.toDto(clientRepository.findById(id));
	}

}

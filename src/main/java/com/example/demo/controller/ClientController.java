package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.ClientDto;
import com.example.demo.service.ClientService;

@Controller
public class ClientController {

private ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@PostMapping("client")
	public ClientDto postClient(@RequestBody ClientDto clientDto, HttpServletResponse response) {
//		TODO: LOGIC
	}
	
	@GetMapping("client/{id}")
	public ClientDto findById(@PathVariable long id) {
		return clientService.findById(id);
	}
}

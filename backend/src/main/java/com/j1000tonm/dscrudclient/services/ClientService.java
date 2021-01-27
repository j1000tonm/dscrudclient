package com.j1000tonm.dscrudclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j1000tonm.dscrudclient.entities.Client;
import com.j1000tonm.dscrudclient.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll() {
		return repository.findAll();
	}
}

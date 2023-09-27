package com.senai.Nicole.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Nicole.entities.Cliente;
import com.senai.Nicole.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	//inserir produto
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	//listar produto por id
	public Cliente getClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	//listar todos os produtos
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	//apagar produto
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}

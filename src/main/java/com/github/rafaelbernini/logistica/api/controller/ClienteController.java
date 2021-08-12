package com.github.rafaelbernini.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rafaelbernini.logistica.domain.model.Cliente;


@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Joao");
		cliente1.setTelefone("18 99999-1111");
		cliente1.setEmail("contato@contato.com");

		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Rafael");
		cliente2.setTelefone("18 99888-2222");
		cliente2.setEmail("contato2@contato.com");
		
		return Arrays.asList(cliente1, cliente2);
		
	}

}

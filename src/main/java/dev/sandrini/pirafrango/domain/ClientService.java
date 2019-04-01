package dev.sandrini.pirafrango.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sandrini.pirafrango.domain.imports.ClientRepository;

@Service
public class ClientService {

	private final ClientRepository clientRepository;

	@Autowired
	public ClientService(final ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public List<Client> findAllClients() {
		return clientRepository.findAll();
	}

	public Client createClient(final String name, final String phone) {
		return clientRepository.save( new Client( name, phone ) );
	}
}

package dev.sandrini.pirafrango.domain.infrastructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.sandrini.pirafrango.domain.Client;
import dev.sandrini.pirafrango.domain.imports.ClientRepository;
import dev.sandrini.pirafrango.domain.infrastructure.imports.ImportedClientJpaRepository;

@Service
public class ClientJpaRepository implements ClientRepository {

	private final ImportedClientJpaRepository impl;

	@Autowired
	public ClientJpaRepository(final ImportedClientJpaRepository impl) {
		this.impl = impl;
	}

	@Override public Client save(Client client) {
		return impl.save( client );
	}

	@Override public List<Client> findAll() {
		return impl.findAll();
	}
}

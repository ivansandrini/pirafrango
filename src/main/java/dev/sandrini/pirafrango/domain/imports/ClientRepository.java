package dev.sandrini.pirafrango.domain.imports;

import java.util.List;

import dev.sandrini.pirafrango.domain.Client;

public interface ClientRepository {

	Client save(Client client);

	List<Client> findAll();
}

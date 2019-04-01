package dev.sandrini.pirafrango.domain.infrastructure.imports;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.sandrini.pirafrango.domain.Client;

public interface ImportedClientJpaRepository extends JpaRepository<Client, Long> {

	Client save(Client client);
}

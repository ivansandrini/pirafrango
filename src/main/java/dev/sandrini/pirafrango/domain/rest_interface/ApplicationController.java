package dev.sandrini.pirafrango.domain.rest_interface;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sandrini.pirafrango.domain.Client;
import dev.sandrini.pirafrango.domain.ClientService;

@RestController
@RequestMapping("/pirafrango")
@Transactional
public class ApplicationController {

	private final ClientService clientService;

	@Autowired
	public ApplicationController(final ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/clients")
	public ResponseEntity<ClientResource[]> getClient() {
		final List<Client> clients = clientService.findAllClients();
		final Stream<ClientResource> result = clients.stream().map( ClientResource::new );
		final ClientResource[] resultArray = result.toArray( ClientResource[]::new );
		return new ResponseEntity<>( resultArray, HttpStatus.OK );
	}

	@PostMapping("/clients")
	public ResponseEntity<ClientResource> createClient(@RequestBody final ClientResource clientResource) {
		Client client = clientService.createClient( clientResource.name, clientResource.phone );
		return new ResponseEntity<>( new ClientResource( client ), HttpStatus.CREATED );
	}

}

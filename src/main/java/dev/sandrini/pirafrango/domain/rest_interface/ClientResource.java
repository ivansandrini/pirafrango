package dev.sandrini.pirafrango.domain.rest_interface;

import dev.sandrini.pirafrango.domain.Client;

public class ClientResource {

	public Long id;
	public String name;
	public String phone;

	public ClientResource() {
	}

	public ClientResource(final Client entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.phone = entity.getPhone();
	}
}

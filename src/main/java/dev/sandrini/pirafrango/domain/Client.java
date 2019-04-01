package dev.sandrini.pirafrango.domain;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import dev.sandrini.pirafrango.domain.base.EntityBase;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client extends EntityBase<Client> {

	private String name;
	private String phone;
}

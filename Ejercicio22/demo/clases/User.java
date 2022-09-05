package com.demo.clases;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.java.Log;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Log


public class User implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	//Atributes
	private Long id;
	private String name;
	private String surname;
	
	//Metodos Custom
	public Long getId() {
		log.info(id.toString());
		return id;
	}
	public String getName() {
		log.info(name);
		return name;
	}

	public String getSurname() {
		log.info(surname);
		return surname;
	}

	

	
	
}

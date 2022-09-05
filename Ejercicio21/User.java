package com.demo.clases;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Atributes
	private Long id;
	private String name;
	private String surname;
}

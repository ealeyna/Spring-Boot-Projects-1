package com.eylulaleynasahin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {

	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private DtoDepartment deparment;
}

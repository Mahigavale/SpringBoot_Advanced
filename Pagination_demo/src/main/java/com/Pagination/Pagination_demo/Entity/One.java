package com.Pagination.Pagination_demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class One {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private int oid;
	
	private String oname;
	
	
	
}

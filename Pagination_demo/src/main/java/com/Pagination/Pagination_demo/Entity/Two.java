package com.Pagination.Pagination_demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Two {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	private int tid;
	
	private String tname;

	
	@JoinColumn(name="oid")
	@OneToOne
	private One one;
	
	
}

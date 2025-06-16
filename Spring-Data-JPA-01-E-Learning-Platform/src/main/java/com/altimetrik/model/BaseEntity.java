package com.altimetrik.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "increment_seq")
	@SequenceGenerator(name = "increment_seq",sequenceName = "increment_seq", initialValue = 10, allocationSize = 1)
	private Integer id;

	private LocalDateTime createdAt;
	
	private LocalDateTime lastModifiedAt;
	
	private String createdBy;
	
	private String lastModifiedBy;
}

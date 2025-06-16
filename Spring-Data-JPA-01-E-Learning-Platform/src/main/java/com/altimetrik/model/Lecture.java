package com.altimetrik.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Lecture extends BaseEntity{
	
	private String lectureName;
	
	@ManyToOne
	@JoinColumn(name = "section_id")
	private Section section;
	
	@OneToOne
	@JoinColumn(name = "resource_id")
	private Resource resource;
}

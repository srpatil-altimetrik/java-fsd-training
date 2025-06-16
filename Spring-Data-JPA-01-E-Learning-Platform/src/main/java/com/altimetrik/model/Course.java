package com.altimetrik.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Course extends BaseEntity{

//	@Column(nullable = false)
	private String courseName;

//	@Column(nullable = false)
	private String courseDescription;

	@ManyToMany
	@JoinTable(name = "author_courses", joinColumns = { @JoinColumn(name = "course_id") }, inverseJoinColumns = {@JoinColumn(name="author_id")})
	private List<Author> authors;
	
	@OneToMany(mappedBy = "course")
	private List<Section> sections;
	
}

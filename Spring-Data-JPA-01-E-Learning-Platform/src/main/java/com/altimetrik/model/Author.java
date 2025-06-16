package com.altimetrik.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
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
//@Table(name = "author_table")
@NamedQuery(
	    name = "Author.findByNameQuery",
	    query = "SELECT a FROM Author a WHERE a.authorAge = :age"
	)
public class Author extends BaseEntity{

//	@Column(name = "author_first_name")
	private String authorFirstName;

	private String authorLastName;
	
	@Column(unique = true, nullable = false)
	private String authorMailId;

	private Integer authorAge;
	
//	@Column(updatable = false, nullable = false)
	private LocalDateTime authorCreatedAt;
	
//	@Column(insertable = false)
	private LocalDateTime authorLastUpdatedAt;
	
	@ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
	private List<Course> courses;
}

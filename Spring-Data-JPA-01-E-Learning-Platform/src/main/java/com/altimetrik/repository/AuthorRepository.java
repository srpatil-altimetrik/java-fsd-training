package com.altimetrik.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.altimetrik.model.Author;

import jakarta.transaction.Transactional;

public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor<Author> {

	@Modifying
	@Transactional
	@Query("update Author a set a.authorAge = :age where a.id = :id")
	int updateAuthor(@Param("age") int age, @Param("id") int id);

	@Transactional
	List<Author> findByNameQuery(@Param("age") int age);

	List<Author> findAuthorsByAuthorFirstName(String str);

	List<Author> findAuthorsByAuthorFirstNameIgnoreCase(String str);

	List<Author> findAuthorsByAuthorFirstNameContainingIgnoreCase(String str);

}

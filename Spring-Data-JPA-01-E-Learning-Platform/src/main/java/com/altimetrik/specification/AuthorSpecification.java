package com.altimetrik.specification;

import org.springframework.data.jpa.domain.Specification;

import com.altimetrik.model.Author;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class AuthorSpecification {

	public static Specification<Author> hasAge(int age){
		return (Root<Author> root, CriteriaQuery<?> query,CriteriaBuilder builder) ->{
			if(age < 0) {
				return null;
			}	
			return builder.equal(root.get("authorAge"), age);
		};
	}
}

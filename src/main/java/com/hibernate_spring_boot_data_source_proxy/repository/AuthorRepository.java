package com.hibernate_spring_boot_data_source_proxy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate_spring_boot_data_source_proxy.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	@Transactional(readOnly = true)
	public Author findByName(String name);
}

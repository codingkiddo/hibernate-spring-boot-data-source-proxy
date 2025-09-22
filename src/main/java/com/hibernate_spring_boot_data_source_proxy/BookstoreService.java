package com.hibernate_spring_boot_data_source_proxy;

import org.springframework.stereotype.Service;

import com.hibernate_spring_boot_data_source_proxy.repository.AuthorRepository;

@Service
public class BookstoreService {

	private final AuthorRepository authorRepository;
	
	 public BookstoreService(AuthorRepository authorRepository) {
	        this.authorRepository = authorRepository;
	    }
}

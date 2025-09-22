package com.hibernate_spring_boot_data_source_proxy.service;

import com.hibernate_spring_boot_data_source_proxy.entity.Author;
import com.hibernate_spring_boot_data_source_proxy.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class BookstoreService {

    private final AuthorRepository authorRepository;

    public BookstoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void persistAuthor() {
        Author author = new Author();
        author.setName("Joana Nimar");
        author.setGenre("History");
        author.setAge(34);

        authorRepository.save(author);
    }

    public void displayAuthor() {

        System.out.println(authorRepository.findById(1L).orElseThrow());
    }
}

package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void performRepositoryTask() {
        System.out.println("BookRepository is performing a task.");
    }
}

package org.example.springexample.servises;

import org.example.springexample.dto.CommentDto;

import java.util.Collection;

public interface CRUDService <T> {
    T getByAuthor(String author);
    Collection <T>  getAll();

    void create(T item);
    void update(String author, T item);

    void update(String author, CommentDto item);

    void delete(String author);
    }

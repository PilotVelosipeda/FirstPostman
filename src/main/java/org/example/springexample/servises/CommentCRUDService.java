package org.example.springexample.servises;

import org.example.springexample.dto.CommentDto;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;
@Service
public class CommentCRUDService implements CRUDService<CommentDto> {
    private final TreeMap<String, CommentDto> commentsStorage = new TreeMap<>();
    @Override
    public CommentDto getByAuthor(String author) {
        System.out.println("Get By Author: " + author);
        return commentsStorage.get(author);
    }
    @Override
    public Collection<CommentDto> getAll() {
        return commentsStorage.values();
    }
    @Override
    public void create(CommentDto item) {
        commentsStorage.put(item.getAuthor(), item);
    }
    @Override
    public void update(String author, CommentDto item) {
        System.out.println("Update: " + author);
        if (!commentsStorage.containsKey(author)) {
            return;
        } else if (item.getAuthor() == null) {
            item.setAuthor(author);
        }
        //item.setText(item.getText());
        commentsStorage.put(author, item);
    }
    @Override
    public void delete(String author) {
        System.out.println("Delete comment: " + commentsStorage.remove(author));
        commentsStorage.remove(author);
    }
}

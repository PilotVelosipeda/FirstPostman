package org.example.springexample.controllers;

import org.example.springexample.dto.CommentDto;
import org.example.springexample.servises.CommentCRUDService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private final CommentCRUDService commentCRUDService;
    public CommentController(CommentCRUDService commentCRUDService) {
        this.commentCRUDService = commentCRUDService;
    }
    @GetMapping("/{author}")
    public CommentDto getCommentById(@PathVariable String author) {
        return commentCRUDService.getByAuthor(author);
    }
    @GetMapping
    public Collection<CommentDto> getAllComments() {
        return commentCRUDService.getAll();
    }
    @PostMapping
    public void createComment(@RequestBody CommentDto commentDto) {
        commentCRUDService.create(commentDto);
    }
    @PutMapping ("/{author}")
    public void updateComment(@PathVariable String author, @RequestBody CommentDto commentDto) {
        commentCRUDService.update(author, commentDto);
    }
    @DeleteMapping ("/{author}")
    public void deleteComment(@PathVariable String author) {
        commentCRUDService.delete(author);
    }
}

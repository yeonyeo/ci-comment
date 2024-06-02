package com.example.comment1.controller;

import com.example.comment1.domain.request.CommentRequest;
import com.example.comment1.domain.response.CommentResponse;
import com.example.comment1.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/comments")
    @RequiredArgsConstructor

    public class CommentController {
        private final CommentService commentService;

        @GetMapping
        public List<CommentResponse> getAllComments() {
            return commentService.getAll();
        }

        @GetMapping("/{id}")
        public CommentResponse getCommentById(@PathVariable("id") Long id) {
            return commentService.getById(id);
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public void saveComment(@RequestBody CommentRequest request) {
            commentService.saveComment(request);
        }
    }

}

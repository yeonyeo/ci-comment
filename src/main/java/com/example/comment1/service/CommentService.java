package com.example.comment1.service;

import com.example.comment1.domain.request.CommentRequest;
import com.example.comment1.domain.response.CommentResponse;

import java.util.List;

public interface CommentService {
    List<CommentResponse> getAll();
    void saveComment(CommentRequest request);
    CommentResponse getById(Long id);
    void deleteById(Long id);
}

package com.example.comment1.service;

import com.example.comment1.domain.entity.Comment;
import com.example.comment1.domain.request.CommentRequest;
import com.example.comment1.domain.response.CommentResponse;
import com.example.comment1.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public CommentResponse getById(Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        return CommentResponse.of(comment);
    }

    @Override
    public void deleteById(Long id) {
        Optional<Comment> byId = commentRepository.findById(id);
        byId.orElseThrow(IllegalArgumentException::new);
        commentRepository.deleteById(id);
    }

    @Override
    public List<CommentResponse> getAll() {
        return commentRepository.findAll()
                .stream()
                .map(CommentResponse::of)
                .toList();
    }

    @Override
    public void saveComment(CommentRequest request) {
        commentRepository.save(request.toEntity());
    }


}

package com.example.comment1.domain.response;

import com.example.comment1.domain.entity.Comment;

public record CommentResponse(
        Long id,
        String text
){
public static CommentResponse of(Comment comment){
    return new CommentResponse(comment.getId(),comment.getText());

}
}

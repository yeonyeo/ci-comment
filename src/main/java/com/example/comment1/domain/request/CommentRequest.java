package com.example.comment1.domain.request;

import com.example.comment1.domain.entity.Comment;


public record CommentRequest(
        String text
){
    public Comment toEntity(){
        return new Comment(null, text);
    }
}

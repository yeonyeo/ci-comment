package com.example.comment1.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Comments")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class Comment {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

}

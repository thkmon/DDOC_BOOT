package com.thkmon.ddoc.web.dto;

import com.thkmon.ddoc.domain.posts.Posts;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDate modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        // this.modifiedDate = entity.getModifiedDate();
    }
}

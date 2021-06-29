package com.jiddong.book.springboot.web.dto;

import com.jiddong.book.springboot.domain.posts.Posts;
import lombok.Getter;

// ResponseDto의 Getter를 확인하자
@Getter
public class PostsResponseDto
{
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity)
    {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author  = entity.getAuthor();

    }
}

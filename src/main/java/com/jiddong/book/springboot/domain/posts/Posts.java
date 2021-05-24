package com.jiddong.book.springboot.domain.posts;

import com.jiddong.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor  //  기본 생성자 자동 추가, public Posts(){}와 같은 효과
@Entity // 테이블과 링크될 클래스
// Entity 클래스 : 테이블과 밀접한 관련이 있으므로 변경해서는 안됨
public class Posts extends BaseTimeEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    // 해당 클래스의 빌더 패턴 클래스를 생성
    public Posts(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author  = author;
    }

    public void update(String title, String content)
    {
        this.title = title;
        this.content = content;
    }
}

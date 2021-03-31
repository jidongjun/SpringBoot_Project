package com.jiddong.book.springboot.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexController
{
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩()
    {
        // when
        String body = this.restTemplate.getForObject("/",String.class);

        // then
        // index.mustache의 글과 틀리니 에러가 발생
        // 글자를 주의하자
        assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }
}
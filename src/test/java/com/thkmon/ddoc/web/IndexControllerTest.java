package com.thkmon.ddoc.web;

import com.thkmon.ddoc.domain.posts.Posts;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() {
        String body = this.restTemplate.getForObject("/", String.class);
        Assertions.assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }

    @Test
    public void 등록페이지_로딩() {
        String body = this.restTemplate.getForObject("/posts/save", String.class);
        Assertions.assertThat(body).contains("게시글 등록");
    }
}
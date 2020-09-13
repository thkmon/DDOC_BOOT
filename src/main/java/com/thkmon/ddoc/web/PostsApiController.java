package com.thkmon.ddoc.web;

import com.thkmon.ddoc.service.posts.PostsService;
import com.thkmon.ddoc.web.dto.PostsResponseDto;
import com.thkmon.ddoc.web.dto.PostsSaveRequestDto;
import com.thkmon.ddoc.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }


    @PutMapping("/api/v1/posts/{id}")
    public long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }


    @DeleteMapping("/api/v1/posts/{id}")
    public long delete(@PathVariable Long id) {
        return postsService.delete(id);
    }


    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto update(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
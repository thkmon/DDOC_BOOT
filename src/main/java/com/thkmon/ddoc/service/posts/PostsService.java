package com.thkmon.ddoc.service.posts;

import com.thkmon.ddoc.domain.posts.Posts;
import com.thkmon.ddoc.domain.posts.PostsRepository;
import com.thkmon.ddoc.web.dto.PostsResponseDto;
import com.thkmon.ddoc.web.dto.PostsSaveRequestDto;
import com.thkmon.ddoc.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다.  id=" + id));

        //

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }

    //public List<PostsLi>
}
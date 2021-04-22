package com.thkmon.ddoc.web;

import com.thkmon.ddoc.config.auth.LoginUser;
import com.thkmon.ddoc.config.auth.dto.SessionUser;
import com.thkmon.ddoc.service.posts.PostsService;
import com.thkmon.ddoc.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @LoginUser SessionUser user) {
        return "index.html";
        /*
        model.addAttribute("posts", postsService.findAllDesc());

        // SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if (user != null) {
            System.out.println("user is not null");
            System.out.println("user.getName() : " + user.getName());
            model.addAttribute("userName", user.getName());
        } else {
            System.out.println("user is null");
        }

        return "index";
        */
    }


    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
}
package com.thkmon.ddoc.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    /*
    // 없어도 동작함
    @GetMapping("/")
    public String index() {
        return "index";
    }
    */

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}
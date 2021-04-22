package com.thkmon.ddoc.web;

import com.thkmon.ddoc.config.auth.LoginUser;
import com.thkmon.ddoc.config.auth.dto.SessionUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping("/game/captain")
    public String index(Model model, @LoginUser SessionUser user) {
        return "/game/captain/index.html";
    }
}

package com.oauth2.controller;

import com.oauth2.domain.SessionMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class OAuthController {

    @GetMapping("/main")
    public String index(Model model, HttpSession session) {
        SessionMember member = (SessionMember) session.getAttribute("member");

        if(member != null) {
            model.addAttribute("username", member.getName());
            model.addAttribute("userImg", member.getPicture());
        }
        return "/main";
    }
}

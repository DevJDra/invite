package com.example.invite.web.invite;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/invite")
public class InviteController {

    @GetMapping("/inviteForm")
    public String inviteForm() {
        System.out.println("asdasd");
        return "invite/inviteForm";
    }
}

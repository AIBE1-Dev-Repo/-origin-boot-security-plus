package org.example.bootsecurityplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/a")
    public String a(Model model) {
        model.addAttribute("msg", "a-user");
        return "index";
    }

    @GetMapping("/b")
    public String b(Model model) {
        model.addAttribute("msg", "b-user");
        return "index";
    }
}

package com.ykm.ylotto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping("/main")
    public String main(Model model) {

        model.addAttribute("name", "SpringBlog from Millky");

        return "main";

    }
}

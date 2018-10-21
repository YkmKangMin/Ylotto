package com.ykm.ylotto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/init")
public class MainController {

    @RequestMapping("/main")
    public String main(Model model) {
        return "main";

    }

    @RequestMapping("/analysis")
    public String analysis(Model model) {
        return "analysis";
    }
}

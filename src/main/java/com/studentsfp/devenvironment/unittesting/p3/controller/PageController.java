package com.studentsfp.devenvironment.unittesting.p3.controller;

import com.studentsfp.devenvironment.unittesting.p3.data.Publication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {
    //RequestContextHolder.getRequestAttributes()
    @PostMapping("/addPublication")
    public String greeting(@ModelAttribute Publication publication,
                           Model model) {
        model.addAttribute("publication", publication);
        return "addPublication";
    }
}

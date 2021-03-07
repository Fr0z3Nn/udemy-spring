package ru.project.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@Controller
public class MainController {

    @PostConstruct
    public void trysout(){
        System.out.println("Bean Created");
    }
    @GetMapping("/show")
    public String showFirstView() {
        return "first-view";
    }
}

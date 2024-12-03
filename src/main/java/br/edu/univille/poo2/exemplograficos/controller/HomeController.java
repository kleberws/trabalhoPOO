package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Página inicial (home.html)
    @GetMapping("/")
    public String home() {
        return "home"; // home.html
    }
}

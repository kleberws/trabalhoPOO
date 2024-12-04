package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreController {

    // Página inicial (home.html)
    @GetMapping("/sobre")
    public String showSobre() {
        return "sobre"; // sobre.html
    }
}

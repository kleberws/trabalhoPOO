package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // Rota para a página inicial
    public String showHomePage() {
        return "home"; // Nome do arquivo HTML na pasta templates
    }

    @GetMapping("/home") // Rota adicional
    public String redirectToHome() {
        return "home"; // Reaproveita o mesmo arquivo HTML
    }
}

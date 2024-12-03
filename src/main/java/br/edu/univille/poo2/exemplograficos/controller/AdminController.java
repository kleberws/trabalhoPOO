package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Página de administração (admin.html)
    @GetMapping("/admin")
    public String admin() {
        return "admin"; // admin.html
    }

    // Página de cadastro (cadastroRelatorio.html)
    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastroRelatorio"; // cadastroRelatorio.html
    }

    // Página de perfil (perfil.html)
    @GetMapping("/perfil")
    public String perfil() {
        return "perfil"; // perfil.html
    }
}

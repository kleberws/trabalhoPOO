package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Página de login
    @GetMapping("/login")
    public String login() {
        return "login"; // login.html
    }

    // Página de cadastro
    @GetMapping("/cadastroUsuario")
    public String cadastro() {
        return "cadastroUsuario"; // cadastroUsuario.html
    }
}

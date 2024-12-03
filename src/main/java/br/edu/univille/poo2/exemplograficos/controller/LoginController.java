package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Página de login (login.html)
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // login.html
    }

    // Página de cadastro de usuário (cadastroUsuario.html)
    @GetMapping("/cadastroUsuario")
    public String showCadastroUsuarioPage() {
        return "cadastroUsuario"; // cadastroUsuario.html
    }
}

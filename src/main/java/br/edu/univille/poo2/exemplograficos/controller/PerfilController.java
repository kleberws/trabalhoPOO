package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerfilController {

    // Página de perfil do usuário
    @GetMapping("/meuPerfil")
    public String showMeuPerfilPage() {
        return "meuPerfil"; // meuPerfil.html
    }
}

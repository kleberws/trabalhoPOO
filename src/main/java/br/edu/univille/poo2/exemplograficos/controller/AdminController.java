package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Página de administração (admin.html)
    @GetMapping("/admin")
    public String showAdminPage() {
        return "admin"; // admin.html
    }

    // Página de cadastro de relatórios (cadastroRelatorio.html)
    @GetMapping("/cadastroRelatorio")
    public String showCadastroRelatorioPage() {
        return "cadastroRelatorio"; // cadastroRelatorio.html
    }

    // Página de perfil (perfil.html)
    @GetMapping("/perfil")
    public String showPerfilPage() {
        return "perfil"; // perfil.html
    }
}

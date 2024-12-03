package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RelatorioController {

    // Página de relatórios gerais
    @GetMapping("/relatorios")
    public String showRelatoriosPage() {
        return "relatorios"; // relatorios.html
    }
}


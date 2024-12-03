package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RelatorioValoresController {

    // Página de relatórios com gráficos de valores
    @GetMapping("/relatorioValores")
    public String showRelatorioValoresPage() {
        return "RelatorioValores"; // RelatorioValores.html
    }
}

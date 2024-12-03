package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RelatorioLabelsController {

    // Página de relatórios com gráficos de labels (RelatorioLabels.html)
    @GetMapping("/relatorioLabels")
    public String relatorioLabels() {
        return "RelatorioLabels"; // RelatorioLabels.html
    }
}

package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompraController {

    // Página de finalização de compra (finalizarCompra.html)
    @GetMapping("/finalizarCompra")
    public String showFinalizarCompraPage() {
        return "finalizarCompra"; // finalizarCompra.html
    }
}

package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoAdminController {

    // Página de administração de produtos
    @GetMapping("/admin/produtos")
    public String produtosAdmin() {
        return "produtosAdmin"; // produtosAdmin.html
    }
}

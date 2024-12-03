package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    // Página de listagem de produtos (produtos.html)
    @GetMapping("/produtos")
    public String produtos() {
        return "produtos"; // produtos.html
    }

    // Página de carrinho de compras (carrinho.html)
    @GetMapping("/carrinho")
    public String carrinho() {
        return "carrinho"; // carrinho.html
    }
}

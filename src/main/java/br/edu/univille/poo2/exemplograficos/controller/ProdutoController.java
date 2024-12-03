package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    // Página de listagem de produtos
    @GetMapping("/produtos")
    public String showProdutosPage() {
        return "produtos"; // produtos.html
    }

    // Página de carrinho de compras
    @GetMapping("/carrinho")
    public String showCarrinhoPage() {
        return "carrinho"; // carrinho.html
    }
}

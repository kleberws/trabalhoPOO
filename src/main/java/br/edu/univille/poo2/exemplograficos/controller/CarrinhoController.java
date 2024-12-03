package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrinhoController {

    // Página do carrinho de compras (carrinho.html)
    @GetMapping("/meuCarrinho")
    public String showCarrinhoPage() {
        return "carrinho"; // carrinho.html
    }
}

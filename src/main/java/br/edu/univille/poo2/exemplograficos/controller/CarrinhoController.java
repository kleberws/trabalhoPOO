package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarrinhoController {

    // Página do carrinho de compras com novo mapeamento
    @GetMapping("/meuCarrinho")
    public String carrinho() {
        return "carrinho"; // carrinho.html
    }
}

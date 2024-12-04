package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.univille.poo2.exemplograficos.repository.ProdutoRepository;

@Controller
public class ProdutoController {
    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("/produtos")
    public String showProdutosPage(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produtos"; // produtos.html
    }

    @GetMapping("/carrinho")
    public String showCarrinhoPage() {
        return "carrinho"; // carrinho.html
    }
}

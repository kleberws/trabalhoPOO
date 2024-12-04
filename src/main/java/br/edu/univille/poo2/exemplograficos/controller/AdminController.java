package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.univille.poo2.exemplograficos.model.Produto;
import br.edu.univille.poo2.exemplograficos.service.ProdutoService;
import java.util.List; 

@Controller
public class AdminController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/admin")
    public String showAdminPage(Model model) {
        List<Produto> produtos = produtoService.getAllProdutos();
        model.addAttribute("produtos", produtos);
        return "admin"; 
    }

}

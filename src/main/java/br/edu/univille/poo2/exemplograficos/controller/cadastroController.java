package br.edu.univille.poo2.exemplograficos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class cadastroController {

    @GetMapping("/cadastro")
    public String exibirFormularioCadastro() {
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String processarCadastro(String nome, String email, String senha, Model model) {
        // Aqui você pode salvar os dados no banco ou processá-los
        System.out.println("Nome: " + nome + ", Email: " + email + ", Senha: " + senha);

        // Retorne uma página de sucesso ou redirecione para outro lugar
        model.addAttribute("mensagem", "Cadastro realizado com sucesso!");
        return "cadastro";
    }
}

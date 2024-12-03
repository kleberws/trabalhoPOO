package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * Classe Produto representando os produtos do sistema.
 */
@Entity
public class Produto {

    // Definindo o ID da entidade e a estratégia de geração de chave primária
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Geração automática do ID pelo banco de dados
    private Long id;

    private String nome;
    private double preco;

    // Construtor padrão
    public Produto() {}

    // Construtor com parâmetros
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método toString (opcional) para exibição dos dados do produto
    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco + "}";
    }
}

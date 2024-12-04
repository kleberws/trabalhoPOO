package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O nome do produto não pode ser nulo.")
    private String nome;

    @NotNull(message = "O preço do produto não pode ser nulo.")
    @Positive(message = "O preço deve ser um valor positivo.")
    private BigDecimal preco;

    private String modelo; // Nova propriedade

    @OneToMany(mappedBy = "produto", orphanRemoval = true)
    private List<ProdutoCategoria> produtoCategorias = new ArrayList<>();

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<ProdutoCategoria> getProdutoCategorias() {
        return produtoCategorias;
    }

    public void setProdutoCategorias(List<ProdutoCategoria> produtoCategorias) {
        this.produtoCategorias = produtoCategorias;
    }

    // Método auxiliar para adicionar uma categoria de forma prática
    public void addProdutoCategoria(ProdutoCategoria categoria) {
        if (categoria != null) {
            this.produtoCategorias.add(categoria);
            categoria.setProduto(this); // Vincula o produto à categoria
        }
    }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco + ", modelo='" + modelo + "'}";
    }
}

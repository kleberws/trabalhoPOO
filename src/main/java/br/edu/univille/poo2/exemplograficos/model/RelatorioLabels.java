package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class RelatorioLabels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único da entidade

    @Column(nullable = true, length = 255) // Adicionando coluna com limite de 255 caracteres
    private String labels; // Atributo adicional de exemplo

    // Construtores
    public RelatorioLabels() {
    }

    public RelatorioLabels(String labels) {
        this.labels = labels;
    }

    public RelatorioLabels(Long id, String labels) {
        this.id = id;
        this.labels = labels;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }
}

package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class RelatorioValores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único da entidade

    @ManyToOne
    @JoinColumn(name = "relatorio_id", nullable = false)
    private Relatorio relatorio;

    @Column(nullable = true) // Remova precision e scale
    private Double valores; // Tipo Double, sem precision ou scale

    // Getters and Setters
    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public Relatorio getRelatorio() { 
        return relatorio; 
    }

    public void setRelatorio(Relatorio relatorio) { 
        this.relatorio = relatorio; 
    }

    public Double getValores() { 
        return valores; 
    }

    public void setValores(Double valores) { 
        this.valores = valores; 
    }
}

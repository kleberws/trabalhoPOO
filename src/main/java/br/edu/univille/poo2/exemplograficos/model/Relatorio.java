package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

import java.time.LocalDate;

@Entity
public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private LocalDate data;  // Usando LocalDate ao invés de java.sql.Date

    @Column(nullable = true)
    private Double totalVendas;

    @Column(length = 255, nullable = true)
    private String legenda;

    @Column(length = 255, nullable = true)
    private String titulo;

    @Column(length = 255, nullable = true)
    private String xlabel;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public Double getTotalVendas() { return totalVendas; }
    public void setTotalVendas(Double totalVendas) { this.totalVendas = totalVendas; }

    public String getLegenda() { return legenda; }
    public void setLegenda(String legenda) { this.legenda = legenda; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getXlabel() { return xlabel; }
    public void setXlabel(String xlabel) { this.xlabel = xlabel; }
}

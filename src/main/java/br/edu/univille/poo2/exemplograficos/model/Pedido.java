package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.time.LocalDate;  // Usando LocalDate para melhor manipulação de datas

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Alterando para LocalDate, que é o tipo recomendado para datas
    @Column(nullable = true)
    private LocalDate dataPedido;

    @Column(nullable = true, length = 50)
    private String status;

    // Getters and Setters
    public Long getId() { 
        return id; 
    }
    
    public void setId(Long id) { 
        this.id = id; 
    }

    public LocalDate getDataPedido() { 
        return dataPedido; 
    }

    public void setDataPedido(LocalDate dataPedido) { 
        this.dataPedido = dataPedido; 
    }

    public String getStatus() { 
        return status; 
    }

    public void setStatus(String status) { 
        this.status = status; 
    }
}

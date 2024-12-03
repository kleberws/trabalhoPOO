package br.edu.univille.poo2.exemplograficos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private LocalDate dataPedido;

    @Enumerated(EnumType.STRING)  // Usando EnumType.STRING para salvar o nome do status no banco
    @Column(nullable = true, length = 50)
    private Status status;  // Tipo Enum para status

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

    public Status getStatus() { 
        return status; 
    }

    public void setStatus(Status status) { 
        this.status = status; 
    }

    // Enum para status do pedido
    public enum Status {
        PENDENTE, 
        FINALIZADO, 
        CANCELADO
    }
}

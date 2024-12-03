package br.edu.univille.poo2.exemplograficos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;

public interface RelatorioValores extends JpaRepository<RelatorioValores, Serializable> {
    // Adicione métodos personalizados se necessário
}

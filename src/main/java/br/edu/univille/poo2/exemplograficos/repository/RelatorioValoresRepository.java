package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.RelatorioValores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioValoresRepository extends JpaRepository<RelatorioValores, Long> {
    // Adicione métodos personalizados se necessário
}

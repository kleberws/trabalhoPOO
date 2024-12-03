package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.RelatorioLabels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioLabelsRepository extends JpaRepository<RelatorioLabels, Long> {
    // Adicione métodos personalizados se necessário
}

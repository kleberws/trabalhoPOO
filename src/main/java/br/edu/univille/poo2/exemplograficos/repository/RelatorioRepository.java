package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatorioRepository extends JpaRepository<Relatorio, Long> {
    // Adicione métodos personalizados, se necessário
}

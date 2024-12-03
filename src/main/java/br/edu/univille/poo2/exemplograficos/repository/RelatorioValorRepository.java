package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.RelatorioValor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioValorRepository extends JpaRepository<RelatorioValor, Long> {
    // Adicione métodos personalizados, se necessário
}

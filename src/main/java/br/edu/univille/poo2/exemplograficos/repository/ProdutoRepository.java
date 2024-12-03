package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Adicione métodos personalizados se necessário
}

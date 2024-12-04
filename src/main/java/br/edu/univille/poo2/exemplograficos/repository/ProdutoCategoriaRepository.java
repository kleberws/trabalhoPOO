package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.ProdutoCategoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoCategoriaRepository extends JpaRepository<ProdutoCategoria, Long> {
}

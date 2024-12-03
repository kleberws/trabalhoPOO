package br.edu.univille.poo2.exemplograficos.repository;

import br.edu.univille.poo2.exemplograficos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Método para buscar usuário pelo e-mail
    Optional<Usuario> findByEmail(String email);

    // Método para verificar se já existe um usuário com o e-mail fornecido
    boolean existsByEmail(String email);
}

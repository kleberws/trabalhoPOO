package br.edu.univille.poo2.exemplograficos.service;

import br.edu.univille.poo2.exemplograficos.model.Usuario;
import br.edu.univille.poo2.exemplograficos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método para cadastrar ou atualizar um usuário
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Método para buscar um usuário pelo ID
    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // Método para buscar um usuário pelo e-mail (simples)
    public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    // Método para verificar se o email já está cadastrado
    public boolean verificarEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}

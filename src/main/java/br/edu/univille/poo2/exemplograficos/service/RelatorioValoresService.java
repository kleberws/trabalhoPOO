package br.edu.univille.poo2.exemplograficos.service;

import br.edu.univille.poo2.exemplograficos.model.RelatorioValor;
import br.edu.univille.poo2.exemplograficos.repository.RelatorioValorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelatorioValoresService {
    @Autowired
    private RelatorioValorRepository repository;

    public List<RelatorioValor> getAllValores() {
        return repository.findAll();
    }

    public Optional<RelatorioValor> getValorById(Long id) {
        return repository.findById(id);
    }

    public RelatorioValor saveValor(RelatorioValor valor) {
        return repository.save(valor);
    }

    public void deleteValor(Long id) {
        repository.deleteById(id);
    }
}

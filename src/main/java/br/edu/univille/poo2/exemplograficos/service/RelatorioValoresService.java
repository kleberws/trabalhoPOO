package br.edu.univille.poo2.exemplograficos.service;

import br.edu.univille.poo2.exemplograficos.model.RelatorioValores;
import br.edu.univille.poo2.exemplograficos.repository.RelatorioValoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelatorioValoresService {
    @Autowired
    private RelatorioValoresRepository repository;

    public List<RelatorioValores> getAllValores() {
        return repository.findAll();
    }

    public Optional<RelatorioValores> getValorById(Long id) {
        return repository.findById(id);
    }

    public RelatorioValores saveValor(RelatorioValores valor) {
        return repository.save(valor);
    }

    public void deleteValor(Long id) {
        repository.deleteById(id);
    }
}

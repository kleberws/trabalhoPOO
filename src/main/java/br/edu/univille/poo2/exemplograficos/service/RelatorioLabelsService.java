package br.edu.univille.poo2.exemplograficos.service;

import br.edu.univille.poo2.exemplograficos.model.RelatorioLabels;
import br.edu.univille.poo2.exemplograficos.repository.RelatorioLabelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelatorioLabelsService {
    @Autowired
    private RelatorioLabelsRepository repository;

    public List<RelatorioLabels> getAllLabels() {
        return repository.findAll();
    }

    public Optional<RelatorioLabels> getLabelById(Long id) {
        return repository.findById(id);
    }

    public RelatorioLabels saveLabel(RelatorioLabels label) {
        return repository.save(label);
    }

    public void deleteLabel(Long id) {
        repository.deleteById(id);
    }
}

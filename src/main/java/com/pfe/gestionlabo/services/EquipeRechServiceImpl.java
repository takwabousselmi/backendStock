package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.EquipeRech;
import com.pfe.gestionlabo.repositories.EquipeRechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeRechServiceImpl implements  EquipeRechService {
  @Autowired
    private EquipeRechRepository equipeRechRepository;

    @Override
    public EquipeRech ajouterEquipeRech(EquipeRech equipeRech) {
       return equipeRechRepository.save(equipeRech);
    }

    @Override
    public List<EquipeRech> getAll() {
        return equipeRechRepository.findAll();
    }

    @Override
    public EquipeRech update(EquipeRech equipeRech) {
        return equipeRechRepository.save(equipeRech);
    }

    @Override
    public void delete(long id) {
      equipeRechRepository.delete(equipeRechRepository.getOne(id));
    }

    @Override
    public EquipeRech getEquipeRech(long id) {
        return equipeRechRepository.getOne(id);
    }
}

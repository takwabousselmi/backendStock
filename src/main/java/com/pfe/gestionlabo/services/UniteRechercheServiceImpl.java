package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.UniteRecherche;
import com.pfe.gestionlabo.repositories.UniteRechercheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class UniteRechercheServiceImpl implements  UniteRechercheService {
    @Autowired
    private UniteRechercheRepository uniteRechercheRepository;

    @Override
    public UniteRecherche ajouteruniteRech(UniteRecherche uniteRecherche) {
        return uniteRechercheRepository.save(uniteRecherche);
    }

    @Override
    public List<UniteRecherche> getAll() {
        return uniteRechercheRepository.findAll();
    }

    @Override
    public UniteRecherche update(UniteRecherche uniteRecherche) {
        return uniteRechercheRepository.save(uniteRecherche);
    }

    @Override
    public void delete(long id) {
        uniteRechercheRepository.delete(uniteRechercheRepository.getOne(id));
    }

    @Override
    public UniteRecherche getUniteById(long id) {
        return uniteRechercheRepository.getOne(id);
    }



}

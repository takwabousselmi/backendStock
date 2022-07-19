package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.entities.UniteRecherche;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public interface UniteRechercheService {
    public UniteRecherche ajouteruniteRech(UniteRecherche uniteRecherche);
    public List<UniteRecherche> getAll();
    public UniteRecherche update(UniteRecherche uniteRecherche);
    public void delete(long id);
    public UniteRecherche getUniteById(long id);

}

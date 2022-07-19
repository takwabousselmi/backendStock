package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.EquipeRech;
import com.pfe.gestionlabo.entities.UniteRecherche;

import java.util.List;

public interface EquipeRechService {

    public EquipeRech ajouterEquipeRech(EquipeRech equipeRech);
    public List<EquipeRech> getAll();
    public EquipeRech update(EquipeRech equipeRech);
    public void delete(long id);
    public EquipeRech getEquipeRech(long id);




}

package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Fournisseur;
import com.pfe.gestionlabo.entities.Labo;

import java.util.List;

public interface FournisseurService {
    public List<Fournisseur> getAllFournisseur();
    public Fournisseur getFournisseurById(Long idFournisseur);
    public Fournisseur  saveFournisseur(Fournisseur fournisseur);
    public void deleteFournisseur(Long idFournisseur);
    public Fournisseur updateFournisseur(Fournisseur fournisseur);

}

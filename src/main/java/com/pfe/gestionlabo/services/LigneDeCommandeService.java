package com.pfe.gestionlabo.services;
import com.pfe.gestionlabo.entities.LigneDeCommande;

import java.util.List;

public interface LigneDeCommandeService {
    public List<LigneDeCommande> getAllLigne();
    public LigneDeCommande getLigneById(long idLine);
    public  LigneDeCommande saveLigne(LigneDeCommande ligne);
    public void deleteLigne(long idLine);
    public LigneDeCommande updateLigne(LigneDeCommande ligne);
}

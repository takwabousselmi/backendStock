package com.pfe.gestionlabo.services;


import com.pfe.gestionlabo.entities.LigneDeCommande;
import com.pfe.gestionlabo.repositories.LigneDeCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneDeCommandeServiceImpl  implements  LigneDeCommandeService{

    @Autowired
    private LigneDeCommandeRepository ligneDeCommandeRepository ;
    @Override
    public List<LigneDeCommande> getAllLigne() {
        return ligneDeCommandeRepository.findAll();
    }

    @Override
    public LigneDeCommande getLigneById(long idLine) {
        return ligneDeCommandeRepository.getOne(idLine);
    }

    @Override
    public LigneDeCommande saveLigne(LigneDeCommande ligne) {
        return ligneDeCommandeRepository.save(ligne);
    }



    @Override
    public void deleteLigne(long idLine) {
        ligneDeCommandeRepository.delete(ligneDeCommandeRepository.getOne(idLine));
    }

    @Override
    public LigneDeCommande updateLigne(LigneDeCommande ligne) {
        LigneDeCommande ligne1=ligneDeCommandeRepository.getOne(ligne.getIdLine());
        ligne1.setQantite(ligne.getQuantite());
        ligne1.setPrix (ligne.getPrix());
        return ligneDeCommandeRepository.save(ligne1);
    }



}

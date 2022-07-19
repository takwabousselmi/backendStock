package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Fournisseur;

import com.pfe.gestionlabo.repositories.FournisseurRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurServiceImpl implements FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;
    @Override
    public List<Fournisseur> getAllFournisseur() {
        return fournisseurRepository.findAll();
    }
    @Override
    public Fournisseur getFournisseurById(Long idFournisseur) {
        return fournisseurRepository.getOne(idFournisseur);
    }
    @Override
    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void deleteFournisseur(Long idFournisseur) {
        System.out.println(fournisseurRepository.getOne(idFournisseur).getNom());
        Fournisseur fournisseur=fournisseurRepository.getOne(idFournisseur);
        fournisseurRepository.delete(fournisseurRepository.getOne(idFournisseur));
    }
    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
        Fournisseur fournisseur1=fournisseurRepository.getOne(fournisseur.getIdFournisseur());
        fournisseur1.setNom(fournisseur.getNom());
        fournisseur1.setPrenom(fournisseur.getPrenom());
        fournisseur1.setEmail(fournisseur.getEmail());
        fournisseur1.setNumerotel(fournisseur.getNumerotel());
        fournisseur1.setEmail(fournisseur.getEmail());
        fournisseur1.setAdresse(fournisseur.getAdresse());

        return fournisseurRepository.save(fournisseur1);
    }








}

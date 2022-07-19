package com.pfe.gestionlabo.services;


import com.pfe.gestionlabo.entities.Commande;


import com.pfe.gestionlabo.repositories.CommandeRepository;
import com.pfe.gestionlabo.repositories.LigneDeCommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService{
    @Autowired
    private CommandeRepository commandeRepository;
    @Override
    public List<Commande> getAllCommande() {
        return commandeRepository.findAll();    }

    @Override
    public Commande getCommandeById(long idC) {
        return commandeRepository.getOne(idC);
    }

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(long idC) {
        commandeRepository.delete(commandeRepository.getOne(idC));
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }



}

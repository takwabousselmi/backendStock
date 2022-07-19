package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Commande;
import com.pfe.gestionlabo.entities.Materiel;
import com.pfe.gestionlabo.entities.Produit;

import java.util.List;

public interface CommandeService {
    public List<Commande> getAllCommande();
    public Commande getCommandeById(long idC);
    public  Commande saveCommande(Commande commande);
    public void deleteCommande(long idC);
    public Commande updateCommande(Commande commande);

}

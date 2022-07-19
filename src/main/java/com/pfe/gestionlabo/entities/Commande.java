package com.pfe.gestionlabo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;
@Entity
public class Commande {
    @Id
    @GeneratedValue

    private Long idC;
    private Date dateHeure;
    private float prixTotal;

    @OneToMany (mappedBy = "commande")

    private List<LigneDeCommande>ligneDeCommande;

    public Commande(Long idC,Date dateHeure,float prixTotal,List<LigneDeCommande> ligneDeCommande){
        this.idC=idC;
        this.dateHeure=dateHeure;
        this.prixTotal=prixTotal;
        this.ligneDeCommande=ligneDeCommande;
    }

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public List<LigneDeCommande> getLigneDeCommande() {
        return ligneDeCommande;
    }

    public void setLigneDeCommande(List<LigneDeCommande> ligneDeCommande) {
        this.ligneDeCommande = ligneDeCommande;
    }
}

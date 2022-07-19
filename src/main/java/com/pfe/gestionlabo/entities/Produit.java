package com.pfe.gestionlabo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("PR")
public class Produit extends Article {
    private Date dateF;
    private Date dateE;

    public Produit() {
    }

    public Produit(Long idArticle, String nom, String ref, long quantite, float prix,
                   String description,Date dateF,Date dateE) {
        super(idArticle, nom, ref, quantite, prix, description);
        this.dateF=dateF;
        this.dateE=dateE;
    }

    public Date getDateE() {
        return dateE;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateE(Date dateE) {
        this.dateE = dateE;
    }
}

package com.pfe.gestionlabo.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class LigneDeCommande {
  @Id
  @GeneratedValue
    private Long idLine;
    private Long quantite;
    private float prix;
    @ManyToOne
    private Commande commande;
    public LigneDeCommande() {
    }

    public LigneDeCommande (Long idLine , Long quantite , float prix) {
    this.idLine = idLine ;
    this.quantite = quantite;
    this.prix = prix;
    }

    public Long getIdLine() {
        return idLine;
    }

    public void setIdLine(Long idLine) {
        this.idLine = idLine;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQantite(Long quantite) {
        this.quantite = quantite;
    }


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }




}

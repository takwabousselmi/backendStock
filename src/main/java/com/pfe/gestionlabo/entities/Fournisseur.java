package com.pfe.gestionlabo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Fournisseur {
     @Id
    @GeneratedValue
     private Long idFournisseur;
     private String nom;
     private String prenom;
     private String email;
     private String adresse;
     private  long numerotel;
   // @ManyToMany(mappedBy = "fournisseur")
    //private List<> ;


    public Fournisseur() {
    }
    public Fournisseur(Long idFournisseur,String nom,
                       String prenom,String email,
                       String adresse,long numerotel) {
        this.idFournisseur = idFournisseur;
        this.nom = nom;
        this.prenom=prenom;
        this.email = email;
        this.adresse=adresse;
        this.numerotel=numerotel;
    }

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public long getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(long numerotel) {
        this.numerotel = numerotel;
    }
}

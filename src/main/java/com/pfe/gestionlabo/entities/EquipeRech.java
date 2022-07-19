package com.pfe.gestionlabo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class EquipeRech {
    @Id
    @GeneratedValue
    private Long idRech;
    private String libelle;
    private Date dateCreation ;
 @ManyToOne
    private UniteRecherche uniteRecherche;

    public EquipeRech() {
    }
    public EquipeRech(String libelle, Date dateCreation , UniteRecherche uniteRecherche ) {
        this.dateCreation =dateCreation;
        this.libelle=libelle;
        this.uniteRecherche=uniteRecherche;
    }

    public Long getIdRech() {
        return idRech;
    }

    public void setIdRech(Long idRech) {
        this.idRech = idRech;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public UniteRecherche getUniteRecherche() {
        return uniteRecherche;
    }

    public void setUniteRecherche(UniteRecherche uniteRecherche) {
        this.uniteRecherche = uniteRecherche;
    }
}

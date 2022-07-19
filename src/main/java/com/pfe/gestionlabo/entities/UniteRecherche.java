package com.pfe.gestionlabo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UniteRecherche {
    @Id
    @GeneratedValue
    private long id;
    private  String label;
     @ManyToOne
     private Labo labo;
    public UniteRecherche() {
    }
    public UniteRecherche(String label){
        this.label=label;

    }

    public UniteRecherche(String label, Labo labo) {
        this.label=label;
        this.labo = labo;
    }

    public Labo getLabo() {
        return labo;
    }

    public void setLabo(Labo labo) {
        this.labo = labo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

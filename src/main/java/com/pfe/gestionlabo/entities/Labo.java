package com.pfe.gestionlabo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Labo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String typeLabo;
    @OneToMany(mappedBy = "labo")
    private List<UniteRecherche> uniteRechercheList;


    public Labo() {
    }

    public Labo(Long id,String name, String typeLabo) {
        this.id = id;
        this.name = name;
        this.typeLabo = typeLabo;
    }

    public Labo(String name, String typeLabo) {
        this.name = name;
        this.typeLabo = typeLabo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeLabo() {
        return typeLabo;
    }

    public void setTypeLabo(String typeLabo) {
        this.typeLabo = typeLabo;
    }
}

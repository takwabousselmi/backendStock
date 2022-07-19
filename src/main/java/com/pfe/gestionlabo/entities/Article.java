package com.pfe.gestionlabo.entities;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "Article")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TypeArticle",discriminatorType = DiscriminatorType.STRING,length = 2)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY,property="TypeArticle")
@JsonSubTypes({
        @JsonSubTypes.Type(name="MM",value= Materiel.class),
        @JsonSubTypes.Type(name="PR",value=Produit.class)


})

public abstract class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idArticle")
    private Long idArticle;
    @Column (name = "nom")
    private String nom;
    @Column (name = "ref")
    private String ref;
    @Column (name = "quantite")
    private long quantite;
    @Column (name = "prix")
    private float prix;
    @Column (name = "description")
    private String description ;


    public Article() {
    }
    public Article(Long idArticle,String nom,String ref, long quantite,float prix,String description) {

    this.idArticle=idArticle;
    this.nom= nom;
    this.ref=ref;
    this.quantite=quantite;
    this.prix=prix;
    this.description=description;

    }



    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public long getQuantite() {
        return quantite;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

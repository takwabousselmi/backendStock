package com.pfe.gestionlabo.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MM")
public class Materiel extends Article {
    private String codeMat;
    private String TypeMAt;

    public Materiel() {

    }

    public Materiel(Long idArticle, String nom, String ref, long quantite, float prix, String description,
                    String codeMat, String typeMAt) {
        super(idArticle, nom, ref, quantite, prix, description);
    this.codeMat=codeMat;
    this.TypeMAt=typeMAt;
    }

    public String getCodeMat() {
        return codeMat;
    }

    public void setCodeMat(String codeMat) {
        this.codeMat = codeMat;
    }

    public String getTypeMAt() {
        return TypeMAt;
    }

    public void setTypeMAt(String typeMAt) {
        TypeMAt = typeMAt;
    }
}

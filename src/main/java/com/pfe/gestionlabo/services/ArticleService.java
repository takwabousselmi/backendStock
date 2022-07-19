package com.pfe.gestionlabo.services;


import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.entities.Materiel;
import com.pfe.gestionlabo.entities.Produit;

import java.util.Date;
import java.util.List;

public interface ArticleService {
    public List<Article> getAllArticle();
    public Article getArticleById(long id);
    public  Article saveArticle(Article article);
    public void deleteArticle(long id);
    public Article updateArticle(Article article);
    public List<Produit> getProduitPerime();
     public List<Produit>gettAllProduit();
    public List<Materiel> getMaterielFin();
    public List<Materiel>getAllMateriel();

}

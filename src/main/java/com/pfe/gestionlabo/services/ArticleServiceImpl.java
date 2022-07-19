package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Materiel;
import com.pfe.gestionlabo.entities.Produit;
import com.pfe.gestionlabo.repositories.ArticleRepository;
import com.pfe.gestionlabo.repositories.MaterielRepository;
import com.pfe.gestionlabo.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements  ArticleService{
 @Autowired
   private ArticleRepository articleRepository;
@Autowired
private ProduitRepository produitRepository;
    @Autowired
    private MaterielRepository materielRepository;
    @Override
    public List<Article> getAllArticle() {
       return articleRepository.findAll();    }

    @Override
    public Article getArticleById(long id) {
        return articleRepository.getOne(id);
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(long id) {
          articleRepository.delete(articleRepository.getOne(id));
    }

    @Override
    public Article updateArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Produit> getProduitPerime() {

        Date date = Date.from(LocalDateTime.now().plusDays(7).atZone(ZoneId.systemDefault()).toInstant());
System.out.println(date);
        return produitRepository.findAllByDateELessThan(date);
    }

    public List<Produit>gettAllProduit(){
        return produitRepository.findAll();
    }

    @Override
    public List<Materiel> getMaterielFin() {

        return materielRepository.findAllByQuantiteIsLessThan(10);
    }

    public List<Materiel>getAllMateriel(){
        return materielRepository.findAll();
    }






}


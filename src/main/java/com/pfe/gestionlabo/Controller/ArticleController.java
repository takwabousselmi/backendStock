package com.pfe.gestionlabo.Controller;


import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Materiel;
import com.pfe.gestionlabo.entities.Produit;
import com.pfe.gestionlabo.services.ArticleService;
import com.pfe.gestionlabo.services.SendemailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)


@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private SendemailService sendemailService;
    @Autowired
    private ArticleService articleService;
    @GetMapping("/")
    public List<Article> getAllArticle(){
        return articleService.getAllArticle();
    }

    @GetMapping("/fin")
    public List<Produit> getf(){
        return articleService.getProduitPerime();

    }
    @GetMapping("/allproduit")
    public List<Produit> getAllproduit(){
        return articleService.gettAllProduit();
    }
    @GetMapping("/allmateriel")
    public List<Materiel> getAllmateriel(){
        return articleService.getAllMateriel();
    }

    @GetMapping("/finm")
    public List<Materiel> getfm(){
        List<Materiel> list=articleService.getMaterielFin();
        if(list.size()>0){
            sendemailService.sendEmail( list);

        }
        return list;

    }




    @GetMapping("/getArticleByid/{id}")
    public Article getArticleById(@PathVariable long id){
        return articleService.getArticleById(id);
    }
    @PostMapping("/save")
    public Article saveArticle (@RequestBody Article article ){
        return articleService.saveArticle(article);
    }
    @PutMapping("/update")
    public Article updateArticle (@RequestBody Article Article){
        return articleService.updateArticle(Article);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteArticle (@PathVariable long id){
        articleService.deleteArticle(id);
    }

}

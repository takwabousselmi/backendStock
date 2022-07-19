package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}

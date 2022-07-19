package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.Article;
import com.pfe.gestionlabo.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseArticleRepository<T extends Article> extends JpaRepository<T,Long >{
}

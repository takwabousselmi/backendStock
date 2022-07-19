package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.Produit;

import java.util.Date;
import java.util.List;

public interface ProduitRepository extends BaseArticleRepository<Produit> {
    List<Produit>findAll();
    List<Produit>findAllByDateELessThan(Date date);
}

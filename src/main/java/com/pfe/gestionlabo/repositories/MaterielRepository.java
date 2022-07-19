package com.pfe.gestionlabo.repositories;


import com.pfe.gestionlabo.entities.Materiel;

import java.util.List;

public interface MaterielRepository extends BaseArticleRepository<Materiel>{
    List<Materiel> findAll();
    List<Materiel>findAllByQuantiteIsLessThan(long quantite);

}

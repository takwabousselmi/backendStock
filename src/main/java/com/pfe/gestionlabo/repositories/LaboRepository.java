package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.Labo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboRepository extends JpaRepository<Labo,Long> {

}

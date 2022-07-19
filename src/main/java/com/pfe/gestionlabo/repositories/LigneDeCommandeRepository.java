package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.LigneDeCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande,Long> {
}

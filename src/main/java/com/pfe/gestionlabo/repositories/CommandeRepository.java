package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.Commande;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository   extends JpaRepository<Commande,Long> {
}

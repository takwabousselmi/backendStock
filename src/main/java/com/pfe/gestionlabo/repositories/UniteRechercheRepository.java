package com.pfe.gestionlabo.repositories;

import com.pfe.gestionlabo.entities.UniteRecherche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniteRechercheRepository extends JpaRepository<UniteRecherche,Long> {


}

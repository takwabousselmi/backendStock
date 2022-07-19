package com.pfe.gestionlabo.Controller;

import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.entities.UniteRecherche;
import com.pfe.gestionlabo.services.UniteRechercheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/unite")
public class UniteRechercheController {
    @Autowired
    private UniteRechercheService uniteRechercheService;
    @GetMapping("/all")
    public List<UniteRecherche> getall(){
        return uniteRechercheService.getAll();
    }
    @PostMapping("/save")
    private  UniteRecherche save(@RequestBody UniteRecherche uniteRecherche){
        return uniteRechercheService.ajouteruniteRech(uniteRecherche);
    }
    @PostMapping("/update")
    public UniteRecherche update (@RequestBody UniteRecherche uniteRecherche)
    {
        return uniteRechercheService.update(uniteRecherche);
    }
    @GetMapping("/getunite-rechercheByid/{id}")
    public UniteRecherche getLaboById(@PathVariable long id){
        return uniteRechercheService.getUniteById(id);
    }
    @DeleteMapping("/delete/{id}")
    public void delete (@PathVariable long id ){

        uniteRechercheService.delete(id);
    }


}

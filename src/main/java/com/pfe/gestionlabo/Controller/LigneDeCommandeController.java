package com.pfe.gestionlabo.Controller;

import com.pfe.gestionlabo.entities.LigneDeCommande;

import com.pfe.gestionlabo.services.LigneDeCommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/lignedecommande")
public class LigneDeCommandeController {

    @Autowired
    private LigneDeCommandeService ligneDeCommandeService;
    @GetMapping("/")
    public List<LigneDeCommande> getAllLigne(){
        return ligneDeCommandeService.getAllLigne();
    }
    @GetMapping("/getLigneByid/{idLine}")
    public LigneDeCommande getLigneById(@PathVariable long idLine){
        return ligneDeCommandeService.getLigneById(idLine);
    }
    @PostMapping("/save")
    public LigneDeCommande saveLigne (@RequestBody LigneDeCommande ligne )
    {
        return ligneDeCommandeService.saveLigne(ligne);
    }
    @PutMapping ("/update")
    public LigneDeCommande updateLigne (@RequestBody LigneDeCommande ligne){
        return ligneDeCommandeService.updateLigne(ligne);
    }
    @DeleteMapping("/delete/{idLine}")
    public void deleteLigne (@PathVariable long idLine){

        ligneDeCommandeService.deleteLigne(idLine);
    }






}

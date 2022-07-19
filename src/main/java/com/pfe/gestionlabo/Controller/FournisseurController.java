package com.pfe.gestionlabo.Controller;

import com.pfe.gestionlabo.entities.Fournisseur;

import com.pfe.gestionlabo.services.FournisseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/fournisseur")


public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/")
    public List<Fournisseur> getAllFournisseur(){
        return fournisseurService.getAllFournisseur();
    }
    @GetMapping("/getFournisseurByid/{idFournisseur}")
    public Fournisseur getFournisseurById(@PathVariable long idFournisser)
    {
        return fournisseurService.getFournisseurById(idFournisser);
    }
    @PostMapping("/save")
    public Fournisseur saveFournisseur (@RequestBody Fournisseur fournisseur )
    {
        return fournisseurService.saveFournisseur(fournisseur);
    }
    @PutMapping ("/update")
    public Fournisseur updateFournisseur (@RequestBody Fournisseur fournisseur)
    {
        return fournisseurService.updateFournisseur(fournisseur);
    }
    @DeleteMapping("/delete/{idFournisseur}")
    public void deleteFournisseur (@PathVariable Long idFournisseur){
 System.out.println(idFournisseur);
        fournisseurService.deleteFournisseur(idFournisseur);
    }












}

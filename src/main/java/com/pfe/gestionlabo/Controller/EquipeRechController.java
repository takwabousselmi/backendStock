package com.pfe.gestionlabo.Controller;

import com.pfe.gestionlabo.entities.EquipeRech;
import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.services.EquipeRechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/equiperech")
public class EquipeRechController {
    @Autowired
    private EquipeRechService equipeRechService;
    @GetMapping("/")
    public List<EquipeRech> getAll(){
        return equipeRechService.getAll();
    }
    @GetMapping("/getEquipeByid/{id}")
    public EquipeRech getEquipeById(@PathVariable long id){
        return equipeRechService.getEquipeRech(id);
    }
    @PostMapping("/save")
    public EquipeRech saveEquipe (@RequestBody EquipeRech equipeRech ){
        return equipeRechService.ajouterEquipeRech(equipeRech);
    }
    @PutMapping ("/update")
    public EquipeRech updateEquipe (@RequestBody EquipeRech equipeRech)
    {
        return equipeRechService.update(equipeRech);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteEquipe (@PathVariable long id){

        equipeRechService.delete(id);
    }




}

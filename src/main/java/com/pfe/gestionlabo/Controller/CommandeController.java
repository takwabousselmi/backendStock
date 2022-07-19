package com.pfe.gestionlabo.Controller;
import com.pfe.gestionlabo.entities.Commande;
import com.pfe.gestionlabo.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/commande")
public class CommandeController {
@Autowired
    private CommandeService commandeService;
@GetMapping("/")
public List<Commande> getAllCommande(){
    return commandeService.getAllCommande();
}
    @GetMapping("/getCommandeByid/{idC}")
    public Commande getCommandeById(@PathVariable long idC){
        return commandeService.getCommandeById(idC);
    }
    @PostMapping("/save")
    public  Commande saveCommande (@RequestBody  Commande commande){
        return commandeService.saveCommande(commande);
    }
    @PutMapping ("/update")
    public  Commande updateCommande (@RequestBody  Commande commande){
        return commandeService.updateCommande(commande);
    }
    @DeleteMapping("/delete/{idC}")
    public void deleteCommande (@PathVariable long idC){

        commandeService.deleteCommande(idC);
    }


}

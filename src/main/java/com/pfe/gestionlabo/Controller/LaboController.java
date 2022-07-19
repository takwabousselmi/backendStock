package com.pfe.gestionlabo.Controller;

import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.services.LaboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping("/labo")
public class LaboController {
    @Autowired
    private LaboService laboService;
    @GetMapping("/")
    public List<Labo> getAllLabo(){
        return laboService.getAllLabo();
    }
    @GetMapping("/getLaboByid/{id}")
    public Labo getLaboById(@PathVariable long id){
        return laboService.getLaboById(id);
    }
    @PostMapping("/save")
    public Labo saveLabo (@RequestBody Labo labo ){
        return laboService.saveLabo(labo);
    }
   @PutMapping ("/update")
   public Labo updateLabo (@RequestBody Labo labo){
       return laboService.updateLabo(labo);
   }
   @DeleteMapping("/delete/{id}")
   public void deleteLabo (@PathVariable long id){

        laboService.deleteLabo(id);
   }




}

package com.pfe.gestionlabo;

import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.repositories.LaboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionlaboApplication {

    public static void main(String[] args) {

        SpringApplication.run(GestionlaboApplication.class, args);

    }

}

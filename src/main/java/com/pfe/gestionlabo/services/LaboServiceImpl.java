package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Labo;
import com.pfe.gestionlabo.repositories.LaboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaboServiceImpl implements LaboService {

    @Autowired
  private  LaboRepository laboRepository;
    @Override
    public List<Labo> getAllLabo() {
        return laboRepository.findAll();
    }

    @Override
    public Labo getLaboById(long id) {
        return laboRepository.getOne(id);
    }
   @Override
    public Labo saveLabo(Labo labo) {
        return laboRepository.save(labo);
    }

    @Override
    public void deleteLabo(long id) {
laboRepository.delete(laboRepository.getOne(id));
    }

    @Override
    public Labo updateLabo(Labo labo) {
        Labo labo1=laboRepository.getOne(labo.getId());
        labo1.setName(labo.getName());
        labo1.setTypeLabo(labo.getTypeLabo());
        return laboRepository.save(labo1);
    }
}

package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Labo;

import java.util.List;

public interface LaboService {
    public List<Labo>getAllLabo();
    public Labo getLaboById(long id);
    public  Labo saveLabo(Labo labo);
    public void deleteLabo(long id);
    public Labo updateLabo(Labo labo);
}

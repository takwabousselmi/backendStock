package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Materiel;

import java.util.List;

public interface SendemailService {
    public void sendEmail(List<Materiel> list);
}

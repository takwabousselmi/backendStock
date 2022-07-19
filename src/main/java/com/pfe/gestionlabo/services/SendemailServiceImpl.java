package com.pfe.gestionlabo.services;

import com.pfe.gestionlabo.entities.Materiel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.List;


@Service
public class SendemailServiceImpl implements  SendemailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(List<Materiel> list) {
        StringBuilder  email = new StringBuilder();

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("takwabousselmi0@gmail.com");

        msg.setSubject("Warning!! List materiel ");
        String text="list materiel fini sont:\n";
        for (Materiel m : list){
            text+="nom:"+m.getNom()+ "  "+"quatité:"+m.getQuantite()+"\n";
                    }

        msg.setText(text);

        javaMailSender.send(msg);

    }
}

package com.example.aorientadoeventos.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class MensagemOuvinte {
    @EventListener
    public void handleMensagemEvento(MensagemEvento evento) {
        System.out.println(evento.getMensagem());
    }
}

package com.example.aorientadoeventos.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
@Component
public class MensagemPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publicarMensagem(String mensagem) {
        MensagemEvento evento = new MensagemEvento(this, mensagem);
        applicationEventPublisher.publishEvent(evento);
    }
}

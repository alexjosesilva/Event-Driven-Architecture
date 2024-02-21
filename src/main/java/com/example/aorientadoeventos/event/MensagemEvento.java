package com.example.aorientadoeventos.event;
import org.springframework.context.ApplicationEvent;

public class MensagemEvento extends  ApplicationEvent{
    private final String mensagem;

    public MensagemEvento(Object source, String mensagem) {
        super(source);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

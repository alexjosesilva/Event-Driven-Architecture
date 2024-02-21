package com.example.aorientadoeventos;

import com.example.aorientadoeventos.event.MensagemPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AorientadoeventosApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(AorientadoeventosApplication.class, args);
        MensagemPublisher publisher = context.getBean(MensagemPublisher.class);
        publisher.publicarMensagem("Primeira mensagem em arquitetura orientada a eventos");

    }

}

package com.avraham.agencia.model.decorator;

public interface Notificador {
    void enviar(String destinatario, String mensagem);
    String getTipo();
}
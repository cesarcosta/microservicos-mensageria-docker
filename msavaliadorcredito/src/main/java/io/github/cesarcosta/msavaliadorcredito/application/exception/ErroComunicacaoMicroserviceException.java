package io.github.cesarcosta.msavaliadorcredito.application.exception;

import lombok.Getter;

public class ErroComunicacaoMicroserviceException extends Exception {

    @Getter
    private Integer status;

    public ErroComunicacaoMicroserviceException(String mensagem, Integer status) {
        super(mensagem);
        this.status = status;
    }
}

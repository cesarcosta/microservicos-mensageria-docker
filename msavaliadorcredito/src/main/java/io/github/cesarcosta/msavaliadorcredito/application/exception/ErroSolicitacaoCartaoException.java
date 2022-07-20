package io.github.cesarcosta.msavaliadorcredito.application.exception;

public class ErroSolicitacaoCartaoException extends RuntimeException{

    public ErroSolicitacaoCartaoException(String mensagem) {
        super(mensagem);
    }
}

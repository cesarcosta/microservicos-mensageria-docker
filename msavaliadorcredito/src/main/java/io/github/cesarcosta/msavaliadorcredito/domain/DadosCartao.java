package io.github.cesarcosta.msavaliadorcredito.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosCartao {
    private Long id;

    private String nome;

    private String bandeira;

    private BigDecimal limiteBasico;
}

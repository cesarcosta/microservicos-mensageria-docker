package io.github.cesarcosta.msavaliadorcredito.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class RetornoAvaliacaoCliente {

    private List<CartaoAprovado> cartoes;
}

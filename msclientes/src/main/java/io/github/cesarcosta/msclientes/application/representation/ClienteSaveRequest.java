package io.github.cesarcosta.msclientes.application.representation;

import io.github.cesarcosta.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {

    private String nome;

    private String cpf;

    private Integer idade;

    public Cliente toModel() {
        return new Cliente(cpf, nome, idade);
    }
}

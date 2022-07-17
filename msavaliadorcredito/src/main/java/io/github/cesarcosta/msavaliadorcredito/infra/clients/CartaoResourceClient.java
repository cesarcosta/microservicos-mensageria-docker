package io.github.cesarcosta.msavaliadorcredito.infra.clients;

import io.github.cesarcosta.msavaliadorcredito.domain.CartaoCliente;
import io.github.cesarcosta.msavaliadorcredito.domain.DadosCartao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "mscartoes", path = "/cartoes")
public interface CartaoResourceClient {

    @GetMapping(params = "cpf")
    ResponseEntity<List<CartaoCliente>> getCartoesByCliente(@RequestParam String cpf);

    @GetMapping(params = "renda")
    ResponseEntity<List<DadosCartao>> getCartoesRendaAte(@RequestParam Long renda);
}

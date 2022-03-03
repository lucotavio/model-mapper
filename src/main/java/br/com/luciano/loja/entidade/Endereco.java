package br.com.luciano.loja.entidade;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String logradouro;
    private Integer numero;
    private String cep;
    private String bairro;
}

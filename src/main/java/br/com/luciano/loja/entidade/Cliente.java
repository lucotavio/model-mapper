package br.com.luciano.loja.entidade;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String nome;
    private String cpf;
    private Endereco endereco;
}

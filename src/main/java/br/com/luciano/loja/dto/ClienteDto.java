package br.com.luciano.loja.dto;

import br.com.luciano.loja.entidade.Endereco;
import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    private String nome;
    private String cpf;

    //Campos da entidade Endereco
    private String enderecoLogradouro;
    private Integer enderecoNumero;
    private String enderecoCep;
    private String enderecoBairro;
}

package br.com.luciano.loja.main;

import br.com.luciano.loja.dto.ClienteDto;
import br.com.luciano.loja.entidade.Cliente;
import br.com.luciano.loja.entidade.Endereco;
import org.modelmapper.ModelMapper;

public class ConverterEntidadeEmDto {

    public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        Cliente cliente = Cliente.builder().nome("Luciano")
                                           .cpf("912.296.250-62")
                                           .build();

        Endereco endereco = Endereco.builder().logradouro("Rua Monte Alegre")
                                              .numero(315)
                                              .cep("30260-330")
                                              .bairro("Santa Efigênia")
                                              .build();

        //Configurando o endereco no cliente
        cliente.setEndereco(endereco);

        ClienteDto clienteDto = modelMapper.map(cliente, ClienteDto.class);
        System.out.println(clienteDto);
    }
}

package br.com.luciano.loja.main;

import br.com.luciano.loja.dto.ClienteDto;
import br.com.luciano.loja.entidade.Cliente;
import org.modelmapper.ModelMapper;

public class ConverterDtoEmEntidade {

    public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        ClienteDto clienteDto = ClienteDto.builder().nome("Luciano")
                                                    .cpf("912.296.250-62")
                                                    .enderecoLogradouro("Rua Monte Alegre")
                                                    .enderecoNumero(315)
                                                    .enderecoCep("30260-330")
                                                    .enderecoBairro("Santa Efigênia")
                                                    .build();

        Cliente cliente = modelMapper.map(clienteDto, Cliente.class);

        System.out.println(cliente);
    }
}

package models;

public record AddressDTO(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf
) {}

package br.com.fatecararas.application.dto;

//TODO: Incluir anotações Lombok para Getteres e Setters
public class PagamentoDTO {
    //TODO: inluir validação para "Número do cartão é obrigatório"
    private Integer nroCartao;

    //TODO: inluir validação para"Código de segurança do cartão é obrigatório"
    private Integer codigoSegurancaCartao;

    //TODO: inluir validação para"Valor da compra é obrigatório")
    private Double valorCompra;

}

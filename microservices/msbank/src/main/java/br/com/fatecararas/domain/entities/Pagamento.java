package br.com.fatecararas.domain.entities;

import java.math.BigDecimal;

//TODO: Converter a classe Pagamento em entidade
public class Pagamento {
    private Long id;

    //TODO: Criar o relacionamento M:N com Cartao
    private Cartao cartao;

    private BigDecimal valorCompra;

}

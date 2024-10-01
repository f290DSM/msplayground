package br.com.fatecararas.infra.respositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//TODO: Extenter JpaRepository e indicar a entidade Cartao e seu tipo de chave
public interface CartaoRepository {

    //TODO: Remover comentarios JPQL após extender interface do repository e importar entidade Cartao
//    @Query("select case when count(c.id) > 0 then true else false end from Cartao c where c.codigoSegurancaCartao = :codigoSegurancaCartao and c.nroCartao = :nroCartao")
//    boolean existsCartaoValido(@Param("codigoSegurancaCartao") Integer codigoSegurancaCartao, @Param("nroCartao") Integer nroCartao);

//    @Query("select case when count(c.id) > 0 then true else false end from Cartao c where c.codigoSegurancaCartao = :codigoSegurancaCartao and c.nroCartao = :nroCartao and c.valorCredito >= :valorCompra")
//    boolean existsSaldoSuficiente(@Param("codigoSegurancaCartao") Integer codigoSegurancaCartao, @Param("nroCartao") Integer nroCartao, @Param("valorCompra") BigDecimal valorCompra);

//    @Query("from Cartao c where c.codigoSegurancaCartao = :codigoSegurancaCartao and c.nroCartao = :nroCartao")
//    Cartao findCartao(@Param("codigoSegurancaCartao") Integer codigoSegurancaCartao, @Param("nroCartao") Integer nroCartao);

//    @Modifying
//    @Query("update Cartao c set c.valorCredito = c.valorCredito - :valorCompra where c.codigoSegurancaCartao = :codigoSegurancaCartao and c.nroCartao = :nroCartao")
//    void atualizarSaldo(@Param("codigoSegurancaCartao") Integer codigoSegurancaCartao, @Param("nroCartao") Integer nroCartao, @Param("valorCompra") BigDecimal valorCompra);
}

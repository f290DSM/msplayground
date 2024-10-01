package br.com.fatecararas.msclientes.infra.respositories;

import br.com.fatecararas.msclientes.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> getByCpf(String cpf);
}

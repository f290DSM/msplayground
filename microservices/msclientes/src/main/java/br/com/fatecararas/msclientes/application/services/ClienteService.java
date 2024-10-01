package br.com.fatecararas.msclientes.application.services;

import br.com.fatecararas.msclientes.domain.entities.Cliente;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Transactional
    public Cliente save(Cliente cliente){
        //TODO: Persistir novo cliente
        return null;
    }

    public Optional<Cliente> getByCPF(String cpf){
        //TODO: Buscar cliente por CPF
        return Optional.empty();
    }
}

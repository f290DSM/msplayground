package br.com.fatecararas.msclientes.application.services;

import br.com.fatecararas.msclientes.domain.entities.Cliente;
import br.com.fatecararas.msclientes.infra.respositories.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }

    public Optional<Cliente> getByCPF(String cpf){
        return repository.getByCpf(cpf);
    }
}

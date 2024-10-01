package br.com.fatecararas.msclientes.application.resources;

import br.com.fatecararas.msclientes.application.dto.ClienteDTO;
import br.com.fatecararas.msclientes.application.services.ClienteService;
import br.com.fatecararas.msclientes.domain.entities.Cliente;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clientes")
public class ClientResource {

    private final ModelMapper mapper;
    private final ClienteService service;

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody ClienteDTO dto) {
        Cliente entity = mapper.map(dto, Cliente.class);
        service.save(entity);

        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(dto.getCpf())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    public ResponseEntity<?> getByCpf(@RequestParam("cpf") String cpf) {
        Optional<Cliente> optional = service.getByCPF(cpf);
        if(optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optional.get());
    }
}

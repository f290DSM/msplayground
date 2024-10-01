package br.com.fatecararas.msclientes.application.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDTO {
    @NotNull(message = "CPF não poder ser nulo")
    private String cpf;
    @NotEmpty(message = "Nome não pode estar vazio")
    private String nome;
    @NotBlank(message = "E-mail não pode estar em branco")
    private String email;
}

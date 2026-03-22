package be.tech.easycar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public class PessoaDTO {

    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não pode ser vazio")
    @Size(min = 3, message = "Nome não pode possuir menos de três caracteres")

    @CPF(message = "CPF está fora do padrão válido.")
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

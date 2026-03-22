package be.tech.easycar.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import be.tech.easycar.dto.PessoaDTO;
import be.tech.easycar.entity.Pessoa;
import be.tech.easycar.service.CriarPessoaService;

    @RestController
    @RequestMapping("/v1/pessoa")
    public class PessoaController {

        private final CriarPessoaService criarPessoaService;

        public UsuarioController(CriarUsuarioService criarUsuarioService) {
            this.criarUsuarioService = criarUsuarioService;
        }

        @PostMapping
        public ResponseEntity<Usuario> criarUsuario(@RequestBody @Valid UsuarioDTO usuarioDTO) {
            Usuario usuario = criarUsuarioService.criarUsuario(usuarioDTO.getNome(), usuarioDTO.getIdade(), usuarioDTO.getCpf());
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
        }
    }

}

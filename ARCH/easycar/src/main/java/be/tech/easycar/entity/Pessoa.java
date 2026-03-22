package be.tech.easycar.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name= "CPF", unique = true)
    private String cpf;

    @Column(name = "dataNasc")
    private LocalDateTime dataNasc;

    @Column(name = "cnh")
    private String cnh;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String complemento;

    @Column(name = "cep")
    private String cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "uf")
    private String uf;


    public pessoa() {}

    public pessoa(String nome, String cpf, String cnh, LocalDateTime dataNasc) {
            this.nome = nome;
            this.cpf = cpf;
            this.dataNasc = dataNasc;
            this.cnh = cnh;
        }



    public LocalDateTime getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDateTime dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

   public Long getId() {
            return id;
        }

   public void setId(Long id) {
            this.id = id;
        }



}

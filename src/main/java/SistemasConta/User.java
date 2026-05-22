package SistemasConta;

import java.time.LocalDate;

public class User {
    private int id;
    private String cpf;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;
    private StatusConta status;

    public User (
            int id,
            String cpf,
            String nome,
            String sexo,
            LocalDate dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.status = StatusConta.DADOS_INCOMPLETOS;
    }

    public User() {
    }

    //modificadores id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //modificadores cpf
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //modificadores nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //modificadores sexo
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //modificadores idade
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //modificadores status da conta
    public StatusConta getStatus() {
        return status;
    }
    public void setStatus(StatusConta Status) {
        this.status = Status;
    }















}



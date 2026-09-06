package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private String nome;
    private String email;
    private LocalDate dataNacimento;

    public Cliente(String nome, String email, LocalDate dataNacimento) {
        this.nome = nome;
        this.email = email;
        this.dataNacimento = dataNacimento;
    }

     DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(LocalDate dataNacimento){
        this.dataNacimento = dataNacimento;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente : "+nome);
        sb.append(" ("+dataNacimento.format(fmt)+")");
        sb.append("- "+email);
        return sb.toString();
    }
}

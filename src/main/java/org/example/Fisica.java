package org.example;

public class Fisica extends Pessoa{
    private String cpf;

    public Fisica(Long id, String name, int age, String birthday, String cpf){
        super(id, name, age, birthday);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

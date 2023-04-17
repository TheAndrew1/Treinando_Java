package org.example;

public class Fisica extends Pessoa{
    private String cpf;

    public Fisica(Long id, String name, int age, String birth, String cpf){
        super(id, name, age, birth);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

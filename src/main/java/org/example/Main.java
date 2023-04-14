package org.example;

public class Main {
    public static void main(String[] args) {

        int numero;
        String nome;
        Integer valor;
        double decimal;

        numero = 2;
        nome = "Andre";
        valor = 4;
        decimal = 0.5;

        System.out.println("\n");
        System.out.println(numero);
        System.out.println(nome);
        System.out.println(valor);
        System.out.println(decimal);

        System.out.println("\n");
        System.out.println(numero + valor);
        System.out.println(numero + decimal);
        System.out.println(decimal + valor);
        System.out.println(nome + numero);
        System.out.println(nome + decimal);

        System.out.println("\n");
        nome = nome + numero;
        System.out.println(nome);
        decimal++;
        System.out.println(decimal);

        Fisica andre = new Fisica(1l, "Andre", 21, "12-04-2002", "133.451.119-50");
        System.out.println(andre.getCpf() + " " + andre.getCreationDate() + " " + andre.getAge());
    }
}
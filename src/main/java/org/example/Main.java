package org.example;

public class Main {
    public static void main(String[] args) {
        Fisica andre = new Fisica(1l, "Andre", 21, "12-04-2002", "123.456.789-10");
        System.out.println(andre.getCpf() + " " + andre.getCreationDate() + " " + andre.getAge());

        andre.birthday();

        System.out.println(andre.walk());
        System.out.println(andre.eat("Arroz"));
        System.out.println(andre.getAge());
    }
}
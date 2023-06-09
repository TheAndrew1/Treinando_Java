package org.example;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Pessoa extends AbstractClass implements Acoes{
    private String name;
    private int age;
    private List<String> likes;
    private String birth;

    public Pessoa(Long id, String name, int age, String birth){
        this.setId(id);
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.setCreationDate(LocalDateTime.now());
        this.setActive(true);
    }

    @Override
    public String walk(){
        return "ANDANDO";
    }
    @Override
    public String stop(){
        return "PARANDO";
    }

    @Override
    public String eat(String food) {
        return ("COMENDO " + food.toUpperCase());
    }

    @Override
    public void birthday() {
        age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    public String getBirthday() {
        return birth;
    }

    public void setBirthday(String birthday) {
        this.birth = birthday;
    }
}

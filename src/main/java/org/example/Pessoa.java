package org.example;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Pessoa extends AbstractClass{
    private String name;
    private int age;
    private List<String> likes;
    private String birthday;

    public Pessoa(Long id, String name, int age, String birthday){
        this.setId(id);
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.setCreationDate(LocalDateTime.now());
        this.setActive(true);
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
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

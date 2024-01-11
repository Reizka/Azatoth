package com.renny.gametracker.user;

import java.time.LocalDate;

public class User {
    private Long id;
    private String username;
    private LocalDate dateJoined;
    private Integer age;
    private String email;

    public User() {
    }
    public User(Long id, String username, LocalDate dateJoined, Integer age, String email) {
        this.id = id;
        this.username = username;
        this.dateJoined = dateJoined;
        this.age = age;
        this.email = email;
    }
    public User(String username, LocalDate dateJoined, Integer age, String email) {
        this.username = username;
        this.dateJoined = dateJoined;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", dateJoined=" + dateJoined +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
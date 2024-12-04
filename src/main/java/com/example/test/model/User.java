package com.example.test.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Column(unique = true)
    private String username;

    @NonNull
    private String password;

    public User(Long id, @NonNull String username, @NonNull String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public @NonNull String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    public @NonNull String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
}

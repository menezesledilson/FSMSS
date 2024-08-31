package com.api.blog.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
public class BlogModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "descricao")
    private String description;
    @Column(name= "datacriacao")
    private LocalDateTime datacreation;

    @PrePersist
    protected void onCreate() {
        this.datacreation = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDatacreation() {
        return datacreation;
    }

    public void setDatacreation(LocalDateTime datacreation) {
        this.datacreation = datacreation;
    }
}

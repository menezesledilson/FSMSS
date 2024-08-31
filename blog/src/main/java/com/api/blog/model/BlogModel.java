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
    @Column(name = "conteudo")
    private String content;
    @Column(name= "datacriacao")
    private LocalDateTime datacreation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDatacreation() {
        return datacreation;
    }

    public void setDatacreation(LocalDateTime datacreation) {
        this.datacreation = datacreation;
    }
}

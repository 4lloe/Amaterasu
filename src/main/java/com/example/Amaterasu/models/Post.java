package com.example.Amaterasu.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long _id;

    @Column(name="title")
    private String _title;

    @Column(name="anons")
    private String _anons;

    @Column(name="fullText")
    private String _fullText;

    @Column(name="views")
    private int views;


}

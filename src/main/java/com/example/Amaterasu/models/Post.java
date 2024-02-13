package com.example.Amaterasu.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "posts")
@Data
@AllArgsConstructor
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

    public Post() { //Can be replaced by @NoArgsConstructor
    }

    public Post(String _title, String _anons, String _fullText) {
        this._title = _title;
        this._anons = _anons;
        this._fullText = _fullText;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_anons(String _anons) {
        this._anons = _anons;
    }

    public void set_fullText(String _fullText) {
        this._fullText = _fullText;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Long get_id() {
        return _id;
    }

    public String get_title() {
        return _title;
    }

    public String get_anons() {
        return _anons;
    }

    public String get_fullText() {
        return _fullText;
    }

    public int getViews() {
        return views;
    }
}

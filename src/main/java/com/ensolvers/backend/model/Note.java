package com.ensolvers.backend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private String date;
    private Boolean archived;

    public Note() {
    }

    public Note(Long id, String title, String content, String date, Boolean archived) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.archived = archived;
    }
}

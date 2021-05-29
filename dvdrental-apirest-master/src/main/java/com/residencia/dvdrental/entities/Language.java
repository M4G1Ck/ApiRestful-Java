package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;


@Entity
@Table(name = "language")
public class Language {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "name")
    private String languageName;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToMany(mappedBy = "languageId") //Relacionamento com Film
    private List<Film> filmlist;

    //Getters & Setters
    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Film> getFilmlist() {
        return filmlist;
    }

    public void setFilmlist(List<Film> filmlist) {
        this.filmlist = filmlist;
    }
}

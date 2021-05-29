package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "actor")
public class Actor {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToOne(mappedBy = "actorId") //Relacionamento com Film_Actor_Id
    private Film_Actor film;

    //Getters & Setters
    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Film_Actor getFilm() {
        return film;
    }

    public void setFilm(Film_Actor film) {
        this.film = film;
    }
}

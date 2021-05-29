package com.residencia.dvdrental.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Film_Actor_Id implements Serializable{

    @OneToOne //Chave estrangeira de Actor
    @Column(name = "actor_id")
    private Actor actorId;

    @OneToOne //Chave estrangeira de Film
    @Column(name = "film_id")
    private Film filmId;

    //Constructors
    public Film_Actor_Id(Actor actorId, Film filmId) {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public Film_Actor_Id() {

    }

    //Getters & Setters
    public Actor getActorId() {
        return actorId;
    }

    public void setActorId(Actor actorId) {
        this.actorId = actorId;
    }

    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film_Actor_Id)) return false;
        Film_Actor_Id that = (Film_Actor_Id) o;
        return Objects.equals(getActorId(), that.getActorId()) && Objects.equals(getFilmId(), that.getFilmId());
    }

    //Hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getActorId(), getFilmId());
    }
}

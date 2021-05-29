package com.residencia.dvdrental.entities;


import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "film_actor")
public class Film_Actor {

    @EmbeddedId
    private Film_Actor_Id film_actor_id;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    //Getters & Setters
    public Film_Actor_Id getFilm_actor_id() {
        return film_actor_id;
    }

    public void setFilm_actor_id(Film_Actor_Id film_actor_id) {
        this.film_actor_id = film_actor_id;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

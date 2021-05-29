package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "filme_category")
public class Film_Category {

    @EmbeddedId
    private Film_Category_Id film_category_id;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    //Getters & Setters
    public Film_Category_Id getFilm_category_id() {
        return film_category_id;
    }

    public void setFilm_category_id(Film_Category_Id film_category_id) {
        this.film_category_id = film_category_id;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

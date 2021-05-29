package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "category")
public class Category {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "name")
    private String categoryName;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToOne(mappedBy = "categoryId") //Relacionamento com Film_Category_Id
    private Film_Category Film;

    //Getters & Setters
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Film_Category getFilm() {
        return Film;
    }

    public void setFilm(Film_Category film) {
        Film = film;
    }
}

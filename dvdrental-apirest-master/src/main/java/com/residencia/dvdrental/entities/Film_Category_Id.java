package com.residencia.dvdrental.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Film_Category_Id implements Serializable {

    @OneToOne //Chave estrangeira de Film
    @Column(name = "film_id")
    private Film filmId;

    @OneToOne //Chave estrangeira de Category
    @Column(name = "category_id")
    private Category categoryId;

    //Constructors
    public Film_Category_Id(Film filmId, Category categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }

    public Film_Category_Id() {

    }

    //Getters & Setters
    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film_Category_Id)) return false;
        Film_Category_Id that = (Film_Category_Id) o;
        return Objects.equals(getFilmId(), that.getFilmId()) && Objects.equals(getCategoryId(), that.getCategoryId());
    }

    //Hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getFilmId(), getCategoryId());
    }
}

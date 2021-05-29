package com.residencia.dvdrental.entities;


import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "film")
public class Film {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Integer filmId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Calendar releaseYear;

    @ManyToOne //Chave estrangeira de Language
    @JoinColumn(name = "language_id")
    private Language languageId;

    @Column(name = "rental_duration")
    private Integer rentalDuration;

    @Column(name = "rental_rate")
    private Double rentalRate;

    @Column(name = "length")
    private Integer length;

    @Column(name = "replacement_cost")
    private Double replacementCost;

    @Column(name = "rating")
    private String rating;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "fulltext")
    private String fulltext;

    @OneToOne(mappedBy = "filmId") //Relacionamento com Film_Actor_Id
    private Film_Actor Actor;

    @OneToOne(mappedBy = "filmId") //Relacionamento com Film_Category_Id
    private Film_Category Category;

    @OneToMany(mappedBy = "filmId") //Relacionamento com Inventory
    private List<Inventory> inventorylist;

    //Getters & Setters
    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Calendar releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public Double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(Double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(Double replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }

    public Film_Actor getActor() {
        return Actor;
    }

    public void setActor(Film_Actor actor) {
        Actor = actor;
    }

    public Film_Category getCategory() {
        return Category;
    }

    public void setCategory(Film_Category category) {
        Category = category;
    }

    public List<Inventory> getInventorylist() {
        return inventorylist;
    }

    public void setInventorylist(List<Inventory> inventorylist) {
        this.inventorylist = inventorylist;
    }
}

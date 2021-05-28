package com.residencia.dvdrental.entities;

import java.sql.Time;
import java.time.Year;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*
 * 
 * @author Matheus Alves Barbosa
 * @date 2021-05-26
 * 
*/

@Entity
@Table(name = "film")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private Integer filmId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "release_year")
	private Year releaseYear;
	
	@ManyToOne
	@JoinColumn(name = "language_id", referencedColumnName = "language_id")
	private Language language;
	
	@Column(name = "rental_duration")
	private Integer rentalDuration;
	
	@Column(name = "rental_rate")
	private Integer rentalRate;
	
	@Column(name = "lenght")
	private Integer lenght;
	
	@Column(name = "replacement_cost")
	private Integer replacementCost;
	
	@Column(name = "rating")
	private Integer rating;

	@Column(name = "last_update")
	private Time lastUpdate;
	
	@Column(name = "special_features")
	private String specialFeatures;

	@Column(name = "fulltext")
	private String fullText;
	
	@OneToMany(mappedBy = "film")
	private List<Inventory> listInventory;

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

	public Year getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Year releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Integer getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(Integer rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Integer getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Integer rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Integer getLenght() {
		return lenght;
	}

	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}

	public Integer getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(Integer replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Time getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Time lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public List<Inventory> getListInventory() {
		return listInventory;
	}

	public void setListInventory(List<Inventory> listInventory) {
		this.listInventory = listInventory;
	}
	
}
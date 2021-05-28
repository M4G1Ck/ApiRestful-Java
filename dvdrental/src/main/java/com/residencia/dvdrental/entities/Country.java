package com.residencia.dvdrental.entities;

import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*
 * 
 * @author Matheus Alves Barbosa
 * @date 2021-05-26
 * 
*/

@Entity
@Table(name = "country")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Integer countryId;

	@Column(name = "country")
	private String country;

	@Column(name = "last_update")
	private Time lastUpdate;
	
	@OneToMany(mappedBy = "country")
	private List<City> listCity;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Time getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Time lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<City> getListCity() {
		return listCity;
	}

	public void setListCity(List<City> listCity) {
		this.listCity = listCity;
	}

}
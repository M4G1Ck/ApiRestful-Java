package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;


@Entity
@Table(name = "country")
public class Country {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country")
    private String countryName;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToMany(mappedBy = "countryId") //Relacionamento com City
    private List<City> cityList;

    //Getters & Setters
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}

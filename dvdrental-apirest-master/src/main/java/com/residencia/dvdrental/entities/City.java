package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "city")
public class City {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "city")
    private String cityName;

    @ManyToOne //Chave estrangeira de Country
    @JoinColumn(name = "country_id")
    private Country countryId;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToMany(mappedBy = "cityId") //Relacionamento com Address
    private List<Address> addresslist;

    //Getters & Setters
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Address> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(List<Address> addresslist) {
        this.addresslist = addresslist;
    }
}

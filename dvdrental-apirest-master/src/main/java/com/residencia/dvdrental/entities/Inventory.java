package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;


@Entity
@Table(name = "inventory")
public class Inventory {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventory_id")
    private Integer inventoryId;

    @ManyToOne //Chave estrangeira de Film
    @JoinColumn(name = "film_id")
    private Film filmId;

    @Column(name = "store_id")
    private Integer storeId;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToOne(mappedBy = "inventoryId") //Relacionamento com Rental
    private Rental rental;

    //Getters & Setters
    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
}

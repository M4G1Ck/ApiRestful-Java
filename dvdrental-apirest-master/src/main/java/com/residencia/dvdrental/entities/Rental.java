package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;


@Entity
@Table(name = "rental")
public class Rental {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Integer rentalId;

    @Column(name = "rental_date")
    private Calendar rentalDate;

    @OneToOne //Chave estrangeira de Inventory
    @JoinColumn(name = "inventory_id")
    private Inventory inventoryId;

    @OneToOne //Chave estrangeira de Customer
    @JoinColumn(name = "costumer_id")
    private Customer costumerId;

    @Column(name = "return_date")
    private Calendar returnDate;

    @ManyToOne //Chave estrangeira de Staff
    @JoinColumn(name = "staff_id")
    private Staff staffId;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    @OneToMany(mappedBy = "rentalId") //Relacionamento com Rental
    private List<Rental> rentalList;

    //Getters & Setters
    public Integer getRentalId() {
        return rentalId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public Calendar getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Calendar rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Inventory getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Inventory inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Customer getCostumerId() {
        return costumerId;
    }

    public void setCostumerId(Customer costumerId) {
        this.costumerId = costumerId;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Rental> getRentalList() {
        return rentalList;
    }

    public void setRentalList(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }
}

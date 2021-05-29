package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "store")
public class Store {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Integer storeId;

    @OneToOne //Chave estrangeira de Staff
    @JoinColumn(name = "manager_staff_id")
    private Staff staffId;

    @ManyToOne //Chave estrangeira de Address
    @JoinColumn(name = "address_id")
    private Address addressId;

    @Column(name = "last_update")
    private Calendar lastUpdate;

    //Getters & Setters
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Calendar getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Calendar lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

package com.residencia.dvdrental.entities;

import java.sql.Time;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * 
 * @author Matheus Alves Barbosa
 * @date 2021-05-26
 * 
*/

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Integer customerId;

	@ManyToMany
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	private Store store;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	private Address address;
	
	@Column(name = "activebool")
	private Boolean activeBool;
	
	@Column(name = "create_date")
	private Calendar createDate;
	
	@Column(name = "last_update")
	private Time lastUpdate;
	
	@Column(name = "active")
	private Integer active;
	
	@OneToMany(mappedBy = "customer")
	private List<Payment> listPayment;
	
	@OneToMany(mappedBy = "customer")
	private List<Rental> listRental;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Boolean getActiveBool() {
		return activeBool;
	}

	public void setActiveBool(Boolean activeBool) {
		this.activeBool = activeBool;
	}

	public Calendar getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}

	public Time getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Time lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public List<Payment> getListPayment() {
		return listPayment;
	}

	public void setListPayment(List<Payment> listPayment) {
		this.listPayment = listPayment;
	}

	public List<Rental> getListRental() {
		return listRental;
	}

	public void setListRental(List<Rental> listRental) {
		this.listRental = listRental;
	}

}
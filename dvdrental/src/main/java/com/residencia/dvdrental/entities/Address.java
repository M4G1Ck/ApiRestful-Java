package com.residencia.dvdrental.entities;

import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer actorId;

	@Column(name = "address")
	private String address;

	@Column(name = "address2")
	private String address2;

	@Column(name = "district")
	private String district;
	
	@ManyToOne
	@JoinColumn(name = "city_id", referencedColumnName = "city_id")
	private City city;
	
	@Column(name = "postal_code")
	private String postalCode;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "last_update")
	private Time lastUpdate;
	
	@OneToOne(mappedBy = "address")
	private List<Store> listStore;
	
	@OneToMany(mappedBy = "address")
	private List<Customer> listCustomer;
	
	@OneToMany(mappedBy = "address")
	private List<Staff> listStaff;

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Time getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Time lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<Store> getListStore() {
		return listStore;
	}

	public void setListStore(List<Store> listStore) {
		this.listStore = listStore;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	public List<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(List<Staff> listStaff) {
		this.listStaff = listStaff;
	}

}

package com.residencia.dvdrental.entities;

import java.sql.Time;
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
@Table(name = "store")
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private Integer storeId;

	@Column(name = "manager_staff_id")
	private Integer managerStaffId;

	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "address_id")
	private Address address;

	@Column(name = "last_update")
	private Time lastUpdate;
	
	@ManyToMany(mappedBy = "store")
	private List<Customer> listCustomer;
	
	@OneToMany(mappedBy = "store")
	private List<Inventory> listInventory;
	
	@OneToMany(mappedBy = "store")
	private List<Staff> listStaff;

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(Integer managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Time getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Time lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	public List<Inventory> getListInventory() {
		return listInventory;
	}

	public void setListInventory(List<Inventory> listInventory) {
		this.listInventory = listInventory;
	}

	public List<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(List<Staff> listStaff) {
		this.listStaff = listStaff;
	}
	
}
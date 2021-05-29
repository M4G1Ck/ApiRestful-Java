package com.residencia.dvdrental.entities;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "payment")
public class Payment {

    @Id //Chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Integer paymentId;

    @ManyToOne //Chave estrangeira de Customer
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne //Chave estrangeira de Staff
    @Column(name = "staff_id")
    private Staff staffId;

    @ManyToOne //Chave estrangeira de Rental
    @Column(name = "rental_id")
    private Rental rentalId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_date")
    private Calendar paymentDate;

    //Getters & Setters
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    public Rental getRentalId() {
        return rentalId;
    }

    public void setRentalId(Rental rentalId) {
        this.rentalId = rentalId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Calendar getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }
}

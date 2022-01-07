package com.github.celzoo.tqi_evolution_project;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name="users")
public class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column
    private String name;
    @Column( unique = true)
    private String email;
    @Column(unique = true)
    private String CPF;
    @Column(unique = true)
    private String RG;
    @Column
    private String password;
    @Column
    private String adress;
    @Column
    private double income;
    @Column
    private double loan;
    @Column
    private String date;
    @Column
    private double installments;

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getInstallments() {
        return installments;
    }

    public void setInstallments(double installments) {
        this.installments = installments;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public User() {
    }
}

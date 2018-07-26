package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

    @Id
    private Long id;
    private String companyName;
    private Long employeesNumber;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Long employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}

package com.twisttech.employmanagement.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "empData")



public class EmpModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String empId;
    private String empName;
    private String empPhone;
    private String empCity;
    private String empCompany;
    private String empSalary;
    private String empAnnual;

    public int getId() {
        return id;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public String getEmpCity() {
        return empCity;
    }

    public String getEmpCompany() {
        return empCompany;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public String getEmpAnnual() {
        return empAnnual;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public void setEmpCompany(String empCompany) {
        this.empCompany = empCompany;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public void setEmpAnnual(String empAnnual) {
        this.empAnnual = empAnnual;
    }
}

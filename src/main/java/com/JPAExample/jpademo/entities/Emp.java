package com.JPAExample.jpademo.entities;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emp
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int empid;
    @NonNull
    private String ename;
    @NonNull
    private String gender;
    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }



    public Emp(){}

    public Emp(int empid, @NonNull String ename, @NonNull String gender) {
        this.empid = empid;
        this.ename = ename;
        this.gender = gender;
    }


    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @NonNull
    public String getEname() {
        return ename;
    }

    public void setEname(@NonNull String ename) {
        this.ename = ename;
    }

    @NonNull
    public String getGender() {
        return gender;
    }

    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }


}

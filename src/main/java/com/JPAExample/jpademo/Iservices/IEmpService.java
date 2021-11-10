package com.JPAExample.jpademo.Iservices;

import com.JPAExample.jpademo.entities.Emp;

import java.util.List;

public interface IEmpService {
    public int SaveEmp(Emp E);
    public int UpdateEmp(Emp E, int id);
    public List<Emp> ExtractAll();
    public List<Emp> ExtractByName(String S);
    public List<Emp> EmpNotStatring(String S);
    public List<Emp>employees();
    }

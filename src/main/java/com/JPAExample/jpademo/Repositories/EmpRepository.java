package com.JPAExample.jpademo.Repositories;

import com.JPAExample.jpademo.entities.Emp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpRepository  extends CrudRepository<Emp,Integer>
{
    public List<Emp> findByEname(String S);
    public List<Emp> findByEnameNotLike(String S);
    @Query(value = "select * from emp e where length(ename)=3",nativeQuery = true)
     public  List<Emp> getEmployee();
}

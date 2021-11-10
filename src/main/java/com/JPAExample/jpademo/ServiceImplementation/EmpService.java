package com.JPAExample.jpademo.ServiceImplementation;
import com.JPAExample.jpademo.Iservices.IEmpService;
import com.JPAExample.jpademo.Repositories.EmpRepository;
import com.JPAExample.jpademo.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class EmpService implements IEmpService
{
    @Autowired
    private EmpRepository empRepository;
    public int SaveEmp(Emp E) {
        empRepository.save(E);
        return 1;
    }
    public int UpdateEmp(Emp E, int id) {
     Optional<Emp> O= empRepository.findById(id);
      O.get().setEname(E.getEname());
      O.get().setGender(E.getGender());
      empRepository.save(O.get());
        return 1;

    }
    public List<Emp> ExtractAll()
    {
        Iterable<Emp> EL=empRepository.findAll();
        List<Emp> list=new ArrayList<>();
        EL.forEach(list::add);
        return list;

    }
    public List<Emp> ExtractByName(String S)
    {
        List<Emp> L=empRepository.findByEname(S);
        return L;
    }
    public List<Emp> EmpNotStatring(String S)
    {

        List<Emp> L=empRepository.findByEnameNotLike(S);
        return L;
    }
    public List<Emp>employees()
    {
        return empRepository.getEmployee();
    }
}

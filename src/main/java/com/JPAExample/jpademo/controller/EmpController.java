package com.JPAExample.jpademo.controller;

import com.JPAExample.jpademo.ServiceImplementation.EmpService;
import com.JPAExample.jpademo.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
@Autowired
EmpService empService;
@RequestMapping(value = "/insert",method = RequestMethod.GET)
 public String Insert(Model model)
{
    Emp E=new Emp();
    model.addAttribute("emp",E);

    return "insert";
}
@PostMapping("/insertEmp")
    public String Insert(@ModelAttribute("emp") Emp emp, Model model)
    {
        int r=empService.SaveEmp(emp);
        model.addAttribute("S",r+ " row added");
        return "insert";
    }





}

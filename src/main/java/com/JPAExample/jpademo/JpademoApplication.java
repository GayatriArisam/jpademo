package com.JPAExample.jpademo;
import com.JPAExample.jpademo.Iservices.IEmpService;
import com.JPAExample.jpademo.ServiceImplementation.EmpService;
import com.JPAExample.jpademo.entities.Emp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com.JPAExample.jpademo")
public class JpademoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(JpademoApplication.class, args);
	IEmpService I = (EmpService) context.getBean(EmpService.class);
		Emp E = new Emp();
		E.setEname("Pranav");
		E.setGender("Male");

		int r = I.SaveEmp(E);
		System.out.println(r + " inserted");
		Emp E1 = new Emp();
		E1.setEname("GuruPrasad");
		E1.setGender("Male");

		I.UpdateEmp(E1, 10);

		List<Emp> L = I.ExtractAll();
		System.out.println(L.size());
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i));
		}
		System.out.print("_____________________________________");
		List<Emp>LC=I.ExtractByName("Ram");
		for (int i = 0; i < LC.size(); i++) {
			System.out.println(LC.get(i));
		}
		System.out.print(" Not Like_____________________________________");
		List<Emp>LNL=I.EmpNotStatring("R%");
		for (int i = 0; i < LNL.size(); i++) {
			System.out.println(LNL.get(i));
		}
		System.out.print(" with Query_____________________________________");
		List<Emp> LNQ=I.employees();
		for (int i = 0; i < LNQ.size(); i++) {
			System.out.println(LNQ.get(i));
		}

	}
}

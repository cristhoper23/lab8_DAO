package com.tecsup.lab08.crud.app;

import com.tecsup.lab08.crud.bean.Employee;
import com.tecsup.lab08.crud.dao.EmployeeDAO;
import com.tecsup.lab08.crud.dao.EmployeeDAOImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDAO dao = new EmployeeDAOImpl();
		
		int id = 346;
		
		id = dao.create("Cristhoper", "Ya�ez", (double) 1500, 18);
		
		Employee emp = dao.findById(id);
		
		System.out.println("Create .. " + emp);
		
		dao.update(id, "Cristhoper", "Ya�ez", (double) 1600, 23);
		
		emp = dao.findById(id);
		
		System.out.println("Update .. " + emp);
		
		/*
		dao.delete(id);

		emp = dao.findById(id);

		System.out.println("Delete .. " + emp);		
		
		
		for (Employee item : dao.findAll()) {
			
			System.out.println(item);
			 
		};
		*/
	}

}


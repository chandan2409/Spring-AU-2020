package com.practice.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.practice.controller.ViewController;
import com.practice.models.Employee;

import dao.EmployeeDao;


public class InsertMockito {
	@Test
	public void testusing_Mocks() throws ClassNotFoundException, NoSuchFieldException, SecurityException
	{
		EmployeeDao employeeDAO=mock(EmployeeDao.class);
		Employee  employee=new Employee();
		employee.setEmail("chandan@gmail.com");
		employee.setId(2);
		employee.setFname("chandan");
		employee.setLname("chanda");
		employee.setPhone("9047387545");
		when(employeeDAO.getById(1)).thenReturn(employee);
//		ViewController view=new ViewController();
//		ModelAndView resultemp=view.viewuser(1);
//		Employee actual=(Employee)resultemp.getModel().get("employee");
		System.out.println(employeeDAO.getById(1).getEmail());
		assertEquals("chandan@gmail.com",employeeDAO.getById(1).getEmail());
	}
}

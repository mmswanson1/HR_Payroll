package edu.waketech.csc251.test;

import org.junit.jupiter.api.Test;

import edu.waketech.csc251.collection.DataSetGeneric;
import edu.waketech.csc251.hr.mgmt.*;
import edu.waketech.csc251.hr.person.*;
import edu.waketech.csc251.tools.Screener;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class DataSetGenericTest {
	
	// getList returns a list that holds all three created employees no matter their position
	@Test
	public void testGetList() {
		DataSetGeneric<Employee> test = new DataSetGeneric<>();
		ArrayList<Employee> compareList = new ArrayList<>();
		Employee emp = new Employee("Walter", 30000);
		Employee manager = new Manager("Elizabeth", 65000, "Accounting");
		Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
		test.add(emp);
		test.add(manager);
		test.add(executive);
		compareList.add(emp);
		compareList.add(manager);
		compareList.add(executive);
		assertEquals(test.getList(), compareList);
	}
	
	// getList with an EmployeeOnlyScreen parameter returns a list that holds only the regular employee
	@Test
	public void testGetListEmpScreen() {
		DataSetGeneric<Employee> test = new DataSetGeneric<>();
		ArrayList<Employee> compareList = new ArrayList<>();
		Screener<Employee> screener = new EmployeeOnlyScreen();
		Employee emp = new Employee("Walter", 30000);
		Employee manager = new Manager("Elizabeth", 65000, "Accounting");
		Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
		test.add(emp);
		test.add(manager);
		test.add(executive);
		compareList.add(emp);
		assertEquals(test.getList(screener), compareList);
	}
	
	// getList with an ManagerOnlyScreen parameter returns a list that holds only the manager
		@Test
		public void testGetListManagerScreen() {
			DataSetGeneric<Employee> test = new DataSetGeneric<>();
			ArrayList<Employee> compareList = new ArrayList<>();
			Screener<Employee> screener = new ManagerOnlyScreen();
			Employee emp = new Employee("Walter", 30000);
			Employee manager = new Manager("Elizabeth", 65000, "Accounting");
			Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
			test.add(emp);
			test.add(manager);
			test.add(executive);
			compareList.add(manager);
			assertEquals(test.getList(screener), compareList);
		}
		
		// getList with an ExecutiveScreen parameter returns a list that holds only the executive
		@Test
		public void testGetListExecScreen() {
			DataSetGeneric<Employee> test = new DataSetGeneric<>();
			ArrayList<Employee> compareList = new ArrayList<>();
			Screener<Employee> screener = new ExecutiveScreen();
			Employee emp = new Employee("Walter", 30000);
			Employee manager = new Manager("Elizabeth", 65000, "Accounting");
			Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
			test.add(emp);
			test.add(manager);
			test.add(executive);
			compareList.add(executive);
			assertEquals(test.getList(screener), compareList);
		}

}

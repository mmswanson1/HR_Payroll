package edu.waketech.csc251.hr.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.waketech.csc251.hr.mgmt.*;
import edu.waketech.csc251.hr.person.*;
import edu.waketech.csc251.tools.Screener;

public class ScreenerJUnitTest {
	
	// EmployeeOnlyScreen returns true with regular employee parameter
	@Test
	public void testEmployeeScreenEmp() {
		Employee emp = new Employee("Walter", 30000);
		Screener<Employee> screener = new EmployeeOnlyScreen();
		assertTrue(screener.test(emp));
	}
	
	// EmployeeOnlyScreen returns false with manager parameter
	@Test
	public void testEmployeeScreenManager() {
		Employee manager = new Manager("Elizabeth", 65000, "Accounting");
		Screener<Employee> screener = new EmployeeOnlyScreen();
		assertFalse(screener.test(manager));
	}
	
	// EmployeeOnlyScreen returns false with executive parameter
	@Test
	public void testEmployeeScreenExec() {
		Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
		Screener<Employee> screener = new EmployeeOnlyScreen();
		assertFalse(screener.test(executive));
	}
	
	// ManagerOnlyScreen returns false with regular employee parameter
		@Test
		public void testMangerScreenEmp() {
			Employee emp = new Employee("Walter", 30000);
			Screener<Employee> screener = new ManagerOnlyScreen();
			assertFalse(screener.test(emp));
		}
		
		// ManagerOnlyScreen returns true with manager parameter
		@Test
		public void testManagerScreenManager() {
			Employee manager = new Manager("Elizabeth", 65000, "Accounting");
			Screener<Employee> screener = new ManagerOnlyScreen();
			assertTrue(screener.test(manager));
		}
		
		// ManagerOnlyScreen returns false with executive parameter
		@Test
		public void testMangerScreenExec() {
			Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
			Screener<Employee> screener = new ManagerOnlyScreen();
			assertFalse(screener.test(executive));
		}
		
		// ExecutiveScreen returns false with regular employee parameter
		@Test
		public void testExecutiveScreenEmp() {
			Employee emp = new Employee("Walter", 30000);
			Screener<Employee> screener = new ExecutiveScreen();
			assertFalse(screener.test(emp));
		}
		
		// ExecutiveScreen returns false with manager parameter
		@Test
		public void testExecutiveScreenManager() {
			Employee manager = new Manager("Elizabeth", 65000, "Accounting");
			Screener<Employee> screener = new ExecutiveScreen();
			assertFalse(screener.test(manager));
		}
		
		// ExecutiveScreen returns true with executive parameter
		@Test
		public void testExecutiveScreenExec() {
			Employee executive = new Executive("Cheryl", 100000, "Finance", .3);
			Screener<Employee> screener = new ExecutiveScreen();
			assertTrue(screener.test(executive));
		}
}

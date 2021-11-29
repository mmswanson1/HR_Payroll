package edu.waketech.csc251.hr.person;

import edu.waketech.csc251.tools.Screener;

public class EmployeeOnlyScreen implements Screener<Employee> {
	
	public EmployeeOnlyScreen() {
		
	}

	@Override
	public boolean test(Employee objToTest) {
		if (objToTest instanceof Employee && objToTest.getClass().getSimpleName().equalsIgnoreCase("Employee"))
			return true;
		else
			return false;

	}
}

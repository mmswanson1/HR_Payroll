package edu.waketech.csc251.hr.mgmt;

import edu.waketech.csc251.hr.person.Employee;
import edu.waketech.csc251.tools.Screener;

public class ExecutiveScreen implements Screener<Employee> {
	
	public ExecutiveScreen() {
		
	}

	@Override
	public boolean test(Employee objToTest) {
		if (objToTest instanceof Executive && objToTest.getClass().getSimpleName().equalsIgnoreCase("Executive"))
			return true;
		else
			return false;
	}

}

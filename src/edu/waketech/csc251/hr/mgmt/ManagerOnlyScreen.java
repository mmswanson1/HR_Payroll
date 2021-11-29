package edu.waketech.csc251.hr.mgmt;

import edu.waketech.csc251.hr.person.Employee;
import edu.waketech.csc251.tools.Screener;

public class ManagerOnlyScreen implements Screener<Employee> {
	
	public ManagerOnlyScreen() {
		
	}

	@Override
	public boolean test(Employee objToTest) {
		if (objToTest instanceof Manager
				&& objToTest.getClass().getSimpleName().equalsIgnoreCase("Manager"))
			return true;
		else
			return false;
	}

}

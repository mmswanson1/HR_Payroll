package edu.waketech.csc251.hr.mgmt;

public class Executive extends Manager {
	
	private double bonus;

	public Executive(String name, double salary, String department, double bonus) {
		super(name, salary, department);
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return super.getSalary() + (super.getSalary() * bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Executive [bonus=" + bonus + ", getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment()
				+ ", getName()=" + getName() + "]";
	}

}
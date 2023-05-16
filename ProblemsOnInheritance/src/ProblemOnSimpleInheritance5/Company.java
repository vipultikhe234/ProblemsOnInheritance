package ProblemOnSimpleInheritance5;

public class Company extends Employee {
	
	public void bonus() {
		double bonus = 0.05* salary;
		System.out.println("Bonus of employee : " + bonus);
		System.out.println("Total Salary of Employee : " + (salary + bonus));
	}
}

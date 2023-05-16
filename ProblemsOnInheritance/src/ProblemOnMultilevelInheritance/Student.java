package ProblemOnMultilevelInheritance;

public class Student extends Information {
	int rollNumber = 12;
	int standerd = 12;

	public void studentMethod() {
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Standerd : " + standerd);
	}
}

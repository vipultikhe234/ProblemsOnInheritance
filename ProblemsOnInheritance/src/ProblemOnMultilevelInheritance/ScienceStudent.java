package ProblemOnMultilevelInheritance;

public class ScienceStudent extends Student {
	String clgName = "DMIETR";
	String stream = "Mechanical Engineering";

	public void scienceStudentMethod() {
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Age : " + age);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Email Id : " + emailId);
		System.out.println("Adhar Number : " + adharNumber);
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Standerd : " + standerd);
		System.out.println("College Name : " + clgName);
		System.out.println("Stream : " + stream);
	}
}

package ProblemOnSimpleInheritance4;

import java.util.Scanner;

public class Patient extends Doctor {
	Scanner sc = new Scanner(System.in);
	Doctor d = new Doctor();
	String nameOfPatient;
	String lastName;
	int age;
	String Address;
	int reqConsultance;

	public void aboutPatient() {
		System.out.println("Enter About Patient");
		System.out.println("Enter First Name");
		nameOfPatient = sc.next();
		System.out.println("Enter Last Name");
		lastName = sc.next();
		System.out.println("Enter Age");
		age = sc.nextInt();
		System.out.println("Enter Address");
		Address = sc.next();
		System.out.println(
				"1.Immunologists\n2.Anesthesiologists\n3.Cardiologist\n4.ColonAndRectalSurgeons\n5.CriticalCareMedicineSpecialists\n6.Dermatologists\n7.Endocrinologists\n8.EmergencyMedicineSpecialists\n9.FamilyPhysicians\n10.Gastroenterologists\n11.GeriatricMedicineSpecialists\n12.Hematologists\n13.InfectiousDiseaseSpecialists\n14.Nephrologists\n15.Gynecologists\n16.Ophthalmologists");
		System.out.println("Enter Number of consultance");
		reqConsultance = sc.nextInt();
		System.out.println("===========================================");
	}

	public void showDetail() {
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t---" + Doctor.hospitalName + "---");
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.print("Patient Name : " + nameOfPatient);
		System.out.print("  "+lastName);
		System.out.print("\t\tAge of Patient : " + age);
		System.out.print("\t\tAddress of Patient : " + Address);
		System.out.println(" ");
		if (reqConsultance == 1) {
			d.d1();
			System.out.println(" ");
		} else if (reqConsultance == 2) {
			d.d2();
			System.out.println(" ");
		} else if (reqConsultance == 3) {
			d.d3();
			System.out.println(" ");
		} else if (reqConsultance == 4) {
			d.d4();
			System.out.println(" ");
		} else if (reqConsultance == 5) {
			d.d5();
			System.out.println(" ");
		} else if (reqConsultance == 6) {
			d.d6();
			System.out.println(" ");
		} else if (reqConsultance == 7) {
			d.d7();
			System.out.println(" ");
		} else if (reqConsultance == 8) {
			d.d8();
			System.out.println(" ");
		}
	}
}

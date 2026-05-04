package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("FICHAR DE ALUNO: ");
		student.name = sc.nextLine();
		student.a = sc.nextDouble();
		student.b = sc.nextDouble();
		student.c = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f\n", student.totalGrades());
		System.out.println(student);
		
		sc.close();
	}

}

package entities;

public class Student {
	
	public double a;
	public double b;
	public double c;
	public String name;
	
	public double totalGrades() {
		return a + b + c;
	}
	
	public double approvedOrNotApproved() {
		if(totalGrades() < 60.00) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public double falta() {
		if(totalGrades() < 60.00) {
			double faltando = 60.00 - totalGrades();
			return faltando;
		}else {
			return 0;
		}
	}
	
	public String toString() {
		if(approvedOrNotApproved() == 1) {
			return "PASS";
		} else {
			return "FAILED\nMISSING " + String.format("%.2f", falta()) + " POINTS";
		}
	}
	
}

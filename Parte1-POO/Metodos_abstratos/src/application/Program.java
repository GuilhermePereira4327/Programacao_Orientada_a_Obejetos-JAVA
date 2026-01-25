package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the nummber of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char forma = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			Color cor = Color.valueOf(color);
			
			if(forma == 'r' || forma == 'R') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shape.add(new Rectangle(cor, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shape.add(new Circle(cor, radius));
			}
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS:");
		for(Shape s: shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();
	}

}

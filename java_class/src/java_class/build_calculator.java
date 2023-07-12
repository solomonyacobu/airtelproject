package java_class;

import java.util.Scanner;

public class build_calculator {

	public static void main(String[] args) {
	      
		Scanner calc=new Scanner(System.in);
		
		double x;
		double y;
		double z;
		
		System.out.println("please enter a number : ");
		x = calc.nextDouble();
		System.out.println("please enter a number : ");
		y = calc.nextDouble();
		
		z = x+y;
		System.out.println("your answer is : " + z);
		
		
	
	
	
	}

}

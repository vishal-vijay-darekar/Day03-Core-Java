package Day03;

import java.util.Scanner;

public class Operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		int first=sc.nextInt();
		
		System.out.println("Enter the second number");
		int second=sc.nextInt();
		
		System.out.println("Addition of "+first+" and "+second+" is "+(first+second));
		System.out.println("Substraction of "+first+" and "+second+" is "+(first-second));
		System.out.println("Multiplication of "+first+" and "+second+" is "+(first*second));
		System.out.println("Division of "+first+" and "+second+" is "+(first/second));
		System.out.println("Modular of "+first+" and "+second+" is "+(first%second));
	}

}

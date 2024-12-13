package Day03;

import java.util.Scanner;

public class Checkpositiveornegative {
	public static void main(String[] args) {
		Scanner check=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=check.nextDouble();
		
		if(num>0) {
			System.out.println("Given Number is Positive");
		}else {
			System.out.println("Given Number is Negative");
		}
	}

}

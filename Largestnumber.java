package Day03;

import java.util.Scanner;

public class Largestnumber {
	public static void main(String[] args) {
		Scanner findlargest=new Scanner(System.in);
		
		System.out.println("Enter the any number");
		int one=findlargest.nextInt();
		
		System.out.println("Enter the any number");
		int two=findlargest.nextInt();
		
		if(one>two) {
			System.out.println("Largest Number is  "+one);
		}else {
			System.out.println("Largest Number is  "+two);
		}
		
		
	}

}

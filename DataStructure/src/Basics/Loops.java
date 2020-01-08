package Basics;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int counter = 1;
		//int sum = 0;
		while(counter<=n) {
			System.out.print(counter+" ");
		//	sum = sum+counter;
			counter = counter +1;
		}
		//System.out.println(sum);

	}

}

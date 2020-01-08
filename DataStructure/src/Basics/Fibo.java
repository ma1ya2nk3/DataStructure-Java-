package Basics;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a =0;
		int b =1;
		int sum =0;
		int counter = 1;
		while(counter<=n+1) {
			System.out.print(a+" ");

			sum =a+b;
			a=b;
			b=sum;
		
			counter++;
		}
		

	}

}

package Basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 2;
		int a= 1;
		while(div<=n-1) {
			if(n%div ==0) {
				a=0;
			}
			div=div+1;
			
		}
		if(a==1) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		

	}

}

package Basics;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<=11) {
			System.out.println("child");
		}else if(age>=12 && age<18) {
			System.out.println("teen");
		}else if(age>=18 && age<60){
			System.out.println("adult");
		}else {
			System.out.println("old");
		}

	}

}

package jp.ac.chibafjb.x15g012.kd151;

import java.util.Scanner;

public class ReAssignment151 {

	public static void main(String[] args) {

		Scanner sin = new Scanner(System.in);
		float a,b;
		
		System.out.print("整数ａの入力  --> ");
		a = sin.nextFloat();
		
		System.out.print("整数ｂの入力  --> ");
		b = sin.nextFloat();
		
		sin.close();

		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		
	}

}

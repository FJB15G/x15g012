package jp.ac.chibafjb.x15g012.kd142;

import java.util.Scanner;

public class ReAssignment142 {

	public static void main(String[] args) {
		int a,b;
		Scanner sin = new Scanner(System.in);
		
		System.out.print("整数ａの入力  --> ");
		a = sin.nextInt();
		
		System.out.print("整数ｂの入力  --> ");
		b = sin.nextInt();
		
		sin.close();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		
	}

}

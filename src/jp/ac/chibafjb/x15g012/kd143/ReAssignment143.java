package jp.ac.chibafjb.x15g012.kd143;

import java.util.Scanner;

public class ReAssignment143 {

	public static void main(String[] args) {
		
		String a,b,c;
		Scanner sin = new Scanner(System.in);
		
		System.out.print("住所の入力 --> ");
		a = sin.next();

		System.out.print("氏名の入力 --> ");
		b = sin.next();

		System.out.print("電話番号の入力 --> ");
		c = sin.next();

		sin.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

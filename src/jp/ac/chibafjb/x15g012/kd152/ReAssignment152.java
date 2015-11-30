package jp.ac.chibafjb.x15g012.kd152;

import java.util.Scanner;

public class ReAssignment152 {

	public static void main(String[] args) {
		
		Scanner sin = new Scanner(System.in);
		float r,p;
		p = 3.14f;
		
		System.out.print("半径ｒ --> ");
		r = sin.nextFloat();
		sin.close();
		
		System.out.println("円周   ="+(2*p*r));
		System.out.println("面積   ="+(p*r*r));
		
	}
}	
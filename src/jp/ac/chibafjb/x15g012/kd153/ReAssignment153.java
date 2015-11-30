package jp.ac.chibafjb.x15g012.kd153;

import java.util.Scanner;

public class ReAssignment153 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		float r,p;
		p = 3.14f;
		
		System.out.print("半径ｒ --> ");
		r = sin.nextFloat();
		sin.close();
		
		System.out.println("円周   ="+Math.round(2*p*r*10)/10.0f);
		System.out.println("面積   ="+Math.round(p*r*r*10)/10.0f);
		
	}

}

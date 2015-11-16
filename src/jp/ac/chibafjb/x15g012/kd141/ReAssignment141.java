package jp.ac.chibafjb.x15g012.kd141;

import java.util.Scanner;

public class ReAssignment141 {

	public static void main(String[] args) {
		
		System.out.print("整数を１つ入力してください。  --> ");
		int num;
		Scanner sin = new Scanner(System.in);
		num = sin.nextInt();
		sin.close();
		System.out.println("あなたの入力した数は "+num+" です。");

	}

}

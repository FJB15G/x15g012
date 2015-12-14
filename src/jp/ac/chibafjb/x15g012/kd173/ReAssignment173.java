package jp.ac.chibafjb.x15g012.kd173;

import java.util.Scanner;

public class ReAssignment173 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		int k = 3;
		int[] data = new int[k+1];
		
		for(int i=0;i<k;i++)
			data[i] =  sin.nextInt();
		sin.close();
		
		for(int i=k;i>0;i--)
			data[i] = data[i-1];
		for(int i=0;i<data.length;i++)
			System.out.println("data["+i+"] = "+data[i]);

	}

}

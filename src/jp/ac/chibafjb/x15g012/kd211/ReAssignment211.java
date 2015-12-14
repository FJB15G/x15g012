package jp.ac.chibafjb.x15g012.kd211;

import java.util.Scanner;



class ArrayProc{
	public int maxFind1(int num[], int a){
		int i = 0;
		int m = 0;
		if(i<a){
			for(;i<a;i++){
				if(num[i] > m)
					m = num[i];
			}
			m = num[0];
		}
		return m;
	}
	public int maxFind2(int num[], int a){
		int i = 1;
		int m = num[0];
		if(i<a){
			for(;i<a;i++){
				if(num[i] > m)
					m = num[i];
			}
			m = num[0];
		}
		return m;
	}
}


public class ReAssignment211 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		System.out.print("配列への整数入力");
		int a =  sin.nextInt();
		int[] num = new int[a];
		
		System.out.print("個数分の数値を設定");
		for(int i=0;i<a;i++)
			num[i] =  sin.nextInt();
		
		sin.close();
		
		ArrayProc x1 = new ArrayProc();
		ArrayProc x2= new ArrayProc();
		
		System.out.println("x1で検索された最大値は"+x1.maxFind1(num,a));
		System.out.println("x2で検索された最大値は"+x2.maxFind2(num,a));		
	}

}

package jp.ac.chibafjb.x15g012.kd231;

import java.util.Scanner;

class ArrayProc{
	public int binarySearch1(int d[], int s){
		int L = 0;
		int H = 4;
		int m = (L+H)/2;
		
		for(; L<=H && d[m]!=s;){
			if(d[m]<s)
				L = m+1;
			else
				H = m-1;
			m = (L+H)/2;
		}
		
		if(L<=H)
			return m;
		else
			return -1;
	}
}

public class ReAssignment231 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		int data[] = {4,12,47,71,86};
		for(int i=0;i<data.length;i++){
			System.out.println("data["+i+"] = "+data[i]);
		}
		
		System.out.print("\n探索する値を入力 --> ");
		int s_int =sin.nextInt();
		sin.close();
		
		ArrayProc n = new ArrayProc();
		
		System.out.println("binarySearch1の探索結果：");
		int p = n.binarySearch1(data, s_int);
		if(p != -1)
			System.out.println("探索値"+s_int+"は、配列data["+n.binarySearch1(data, s_int)+"]に存在します。");
		else
			System.out.println("探索値"+s_int+"は、配列data[]に存在しません。");
	}

}

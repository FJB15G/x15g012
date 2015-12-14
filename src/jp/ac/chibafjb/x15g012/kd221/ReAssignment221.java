package jp.ac.chibafjb.x15g012.kd221;

import java.util.Scanner;

class ArrayProc{
	public int linerSearch1(int s[], int n){
		int i = 0;
		for(;i<100&&s[i]!=n;i++)
			i = i+1;
		return (i);
	}
	public int linerSearch2(int s[], int n){
		int i = 99;
		for(;i>=0&&s[i]!=n;i--)
			i = i-1;
		if(i==-1)
			return(100);
		return(i);
	}
}

public class ReAssignment221 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		System.out.print("配列の格納内容はMath.random()*100");
		int[] score = new int[101];
		for(int i=0;i<100;i++)
			score[i] = (int) (Math.random()*100);
		score[100] = 999;
		
		System.out.print("探索する整数を入力");
		int n =  sin.nextInt();
		sin.close();
		
		ArrayProc n1 = new ArrayProc();
		ArrayProc n2= new ArrayProc();
		
		System.out.println("linerSearch1の探索結果：");
		if(n == n1.linerSearch1(score, n))
			System.out.println("探索値"+n+"は、配列score["+n1.linerSearch1(score, n)+"]に存在します。");
		System.out.println("探索値"+n+"は、配列score[]に存在しません。");
		
		System.out.println("linerSearch2の探索結果：");
		if(n == n2.linerSearch2(score, n))
			System.out.println("探索値"+n+"は、配列score["+n1.linerSearch2(score, n)+"]に存在します。");
		System.out.println("探索値"+n+"は、配列score[]に存在しません。");		
	}

}

package jp.ac.chibafjb.x15g012.kdT21;

import java.util.Scanner;

public class ReAssignmentT21 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		
		System.out.print("ハンバーガーの個数　　-->　");
		int h = sin.nextInt();
		System.out.print("フライドポテトの個数　-->　");
		int p = sin.nextInt();
		System.out.println();
		
		int H=h*100;
		int P=p*180;
		int a=H+P;
		
		System.out.println("ハンバーガーの代金　　＝　"+H+"円");
		System.out.println("フライドポテトの代金　＝　"+P+"円");
		System.out.println("小計　　　　　　　　　＝　"+a+"円");
		System.out.println();
		
		float t = 0.08f;
		int T =(int)(a*t);
		int A =a+T;	
		
		System.out.println("消費税　　　　　　　　＝　"+T+"円");
		System.out.println("合計金額　　　　　　　＝　"+A+"円");
		System.out.println();
		
		System.out.print("受取金額　　　　　　　-->　");
		int B = sin.nextInt();
		sin.close();
		
		System.out.println("つり銭　　　　　　　　＝　"+(B-A)+"円");

	}

}

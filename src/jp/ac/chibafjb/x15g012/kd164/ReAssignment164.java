package jp.ac.chibafjb.x15g012.kd164;

public class ReAssignment164 {

	public static void main(String[] args) {
		int m = 3;
		int[] a = new int[m];
		int[] b = new int[m];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		
		for(int i=0; i<m; i++){
			b[i] = a[i];
			System.out.println("b["+i+"] = "+b[i]);
		}

	}

}

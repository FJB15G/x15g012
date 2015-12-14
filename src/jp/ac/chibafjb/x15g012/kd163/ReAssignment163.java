package jp.ac.chibafjb.x15g012.kd163;

public class ReAssignment163 {

	public static void main(String[] args) {
		int n = 5;
		int[] x = new int[n];
		x[0] =33;
		x[1] =18;
		x[2] =102;
		x[3] =47;
		x[4] =5;
		
		int sum = 0;
		for(int i=0;i<n;i++)
			sum = sum + x[i];
		System.out.println("合計 = "+sum);

	}

}

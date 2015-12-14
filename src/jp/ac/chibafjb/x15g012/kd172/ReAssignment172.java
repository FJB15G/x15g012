package jp.ac.chibafjb.x15g012.kd172;

public class ReAssignment172 {

	public static void main(String[] args) {
		int m = 3;
		int n = 2;
		
		int[] x = new int[m];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		
		int[] y = new int[n];
		y[0] = 7;
		y[1] = 8;
		
		int[] z = new int[m+n];
		
		for(int i=0;i<m;i++)
			z[i] = x[i];
		for(int i=m;i<m+n;i++)
			z[i] = y[i-m];
		
		System.out.print("z[] = {");
		for(int i=0;i<m+n;i++)
		{
			System.out.print((i!=0?",":"")+z[i]);
		}
		System.out.println("}");

	}

}

package jp.ac.chibafjb.x15g012.kd161;

public class ReAssignment161 {

	public static void main(String[] args) {
		int[] test ={10,20};
		
		int work = test[1];
		test[1] = test[0];
		test[0] = work;
		
		for(int i=0; i<=1; i++)
			System.out.println("test["+i+"] = "+test[i]);

	}

}

package jp.ac.chibafjb.x15g012.kd171;

public class ReAssignment171 {

	public static void main(String[] args) {
		int k = 3;
		int[] data = new int[k+1];
		data[0] = 100;
		data[1] = 200;
		data[2] = 300;
		
		for(int i=k;i>0;i--)
			data[i] = data[i-1];
		for(int i=0;i<data.length;i++)
			System.out.println("data["+i+"] = "+data[i]);

	}

}

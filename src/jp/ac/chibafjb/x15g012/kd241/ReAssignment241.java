package jp.ac.chibafjb.x15g012.kd241;

class ArrayProc{
	public int[] bubbleSort1(int num[]){
		for(int j=num.length-1; j>=1; j--){
			for(int i=0; i<j; i++){
				if(num[i]>num[i+1]){
					int work=num[i]; num[i]=num[i+1]; num[i+1]=work;
				}
			}
		}
		return num;
	}
}

public class ReAssignment241 {

	public static void main(String[] args) {
		int num[] = {75,31,64,27,5};
		
		System.out.print("整列前：　num[] = ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+",");
		}
		System.out.println();
		
		ArrayProc n = new ArrayProc();
		num = n.bubbleSort1(num);
		
		System.out.print("整列後：　num[] = ");
		for(int a=0;a<num.length;a++){
			System.out.print(num[a]+",");
		}
	}

}

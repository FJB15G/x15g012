package jp.ac.chibafjb.x15g012.kd243;

class ArrayProc{
	public int[] bubbleSort1(int num[]){
		for(int j=num.length-1; j>=1; j--){
			System.out.print(num.length-j+"サイクル目\n");
			for(int i=0; i<j; i++){
				if(num[i]<num[i+1]){
					int work=num[i]; num[i]=num[i+1]; num[i+1]=work;
					
					System.out.print(i+1+"回目：num[] = ");
					for(int a=0;a<num.length;a++){
						System.out.print(num[a]+",");
					}
					System.out.println();
				}
			}
		}
		return num;
	}
}

public class ReAssignment243 {

	public static void main(String[] args) {
		int num[] = {5,27,64,31,75};
		
		System.out.print("整列前：　num[] = ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+",");
		}
		System.out.println();
		
		ArrayProc n = new ArrayProc();
		num = n.bubbleSort1(num);
		
		System.out.print("\n整列後：　num[] = ");
		for(int a=0;a<num.length;a++){
			System.out.print(num[a]+",");
		}
	}

}
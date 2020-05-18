package Test_0518;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); 
		int M = sc.nextInt();  
		int result = 0;
		
		int[] num = new int[N]; 
		
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		} 
	
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int z=j+1; z<N; z++ ) {
					int sum = num[i] + num[j] + num[z]; 
					if(sum<=M) {
						result = Math.max(result, sum);
					} 
				}
			}
		}
		System.out.println(result);	
	}
}



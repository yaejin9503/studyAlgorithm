package Test_0515;

import java.util.Scanner;

public class Ex4 {

	static String solution(int[] arrs) {
		
		String result = "";
		int ascending =0; 
		int descending =0; 
		
		for(int i=0; i<arrs.length-1;i++) {
			if(arrs[i+1] == arrs[i]+1) { //오름차순 일 경우 
				ascending += 1;
			}else if(arrs[i+1] == arrs[i]-1) { //내림차순 일 경우
				descending +=1;
			}
		}		
		if(ascending == arrs.length-1) {
			result = "ascending";
		}else if(descending == arrs.length-1) {
			result = "descending";
		}else {
			result = "mixed";
		}
		
		return result; 
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int [] arr = new int[8]; 
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt(); 
		}
		System.out.println(solution(arr));
	} 
}

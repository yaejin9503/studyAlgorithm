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
// 내코드는 12345678 이런식으로 숫자가 하나씩 늘어날 때만 할 수 있게 짜놓았고 
// 밑에 강사님 코드는 그런거 상관없이 오름차순이거나 내림차순일 때 돌아가게 짜놓았다. 

/*
  
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[8];
		boolean ascending = true;
		boolean descending = true;
		
		for (int i = 0; i < 8; i++) {
			data[i] = sc.nextInt();
		}

		for (int i = 1; i < 8; i++) {
			if (data[i] > data[i - 1]) descending = false;
			if (data[i] < data[i - 1]) ascending = false;
		}
		
		if (ascending) System.out.println("ascending");
		else if (descending) System.out.println("descending");
		else System.out.println("mixed");
	}

}
*/

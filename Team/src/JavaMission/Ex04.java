package JavaMission;

import java.util.Scanner;

public class Ex04{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){ //총 출력되는 출 수

		    for(int j = 0; j < n - i; j++){ //공백 출력
		        System.out.print(" ");
		    }

		    for(int k = 0; k < i * 2 - 1; k++){ // '*' 출력 부분
		        System.out.print("*");
		    }
		    System.out.println();
		}
    }
}

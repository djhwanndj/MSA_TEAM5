package javaMission;

import java.util.Scanner;

public class _002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 1부터 n까지 값을 나열하는데
		// 홀수일 때만 더하기 (홀수 일 때는 1부터 2씩 증가)
		// 짝수일 때만 더하기 (짝수일 때는 2부터 2씩 증가)
		int sum1=0;
		int sum2=0;
		
		
		for (int i = 0; i < n; i++) {
			i++;
			if (i%2!=0) {
				sum1 +=i;
				System.out.print(i);
				if(i<n-1) {
					System.out.print("+");
				}
			}
		}
		System.out.println("=" +sum1);
		
		for (int i = 1; i < n; i++) {
			i++;
			if (i%2==0) {
				sum2 +=i;
				System.out.print(i);
				if(i<n) {
					System.out.print("+");
				}
			}
		}
		System.out.println("="+sum2);
		
		// 약수 출력하기
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				System.out.print(i+ " ");
			}
		}
		
		sc.close();
	}
}

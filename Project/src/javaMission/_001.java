package javaMission;

import java.util.Scanner;

public class _001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println("총점 : " + (java+math+eng));
		System.out.println("평균 : " + (double)(java+math+eng)/3);
		
		sc.close();
	}

}

package JavaMission;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 메뉴판
		// 변수 선언 : 메뉴 번호, 메뉴 이름
		int menuNo = 0;
		String menuName = "";
		Scanner sc = new Scanner(System.in);
		int count = 0;

		// do~while문
		// : 무조건 1회는 실행 후 , 조건을 검사하여 반복하는 문장
		do {
			System.out.println("********** 치킨 메뉴판 **********");
			System.out.println("1. 황금올리브 반반한 치킨");
			System.out.println("2. 뿌잉클 치킨");
			System.out.println("3. 처갓집에서 호식이가 만든 치킨");
			System.out.println("0. 종료");
			System.out.print("********** 번호 : ");

			// 메뉴 번호 입력
			menuNo = sc.nextInt();
			
			// break : 제어문을 탈출
			// 방법1
			if ( menuNo == 0 )
			    break;
			
			// return 값; : 메소드를 종료. 메모리 공간 해제. (값) 메소드를 호출한 곳으로 반환
			// 방법2
			// if( menuNo == 0 ){System.out.println("메뉴판을 종료합니다."); return;} 

			switch (menuNo) {
			case 1:
				menuName = "황금올리브 반반한 치킨"; break;
			case 2:
				menuName = "뿌잉클 치킨"; break;
			case 3:
				menuName = "처갓집에서 호식이가 만든 치킨"; break;
			}
			// 메뉴번호 유효성 검사
			// 방법1 - 메뉴번호가 0~5번만 유효
			// 방법2 - 0번만 아니면 유효
			// 방법3 - 1~3번 유효, 그 이외 무효
			if (menuNo >= 1 && menuNo <= 3) {
		    // if (menuNo != 0)
				System.out.println(menuName + "이(/가) 주문되었습니다.");
            count++;
			} else
				System.out.println("(0~3)번 사이의 번호를 입력해주세요.");

		} while (menuNo != 0);
		
		
		// 주문한 메뉴 개수를 출력해주세요.
        System.out.println("총 " + count + " 개의 상품이 주문되었습니다.");
		sc.close();
	}

}

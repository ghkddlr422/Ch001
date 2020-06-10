package Ch001;

import java.util.Scanner;

public class GradeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("등수 입력");
		Scanner sc = new Scanner (System.in);
		int a = 0;
		a = sc.nextInt();
		switch (a) {
		case 1 :
			System.out.println("아주 잘했습니다.");
			break;
		case 2 :
		case 3 :
			System.out.println("잘했습니다.");
			break;
		case 4 :
		case 5 :
		case 6 :
			System.out.println("보통입니다.");
			break;
			
		default :
			System.out.println("똥멍청이");
		}
			
	}

}

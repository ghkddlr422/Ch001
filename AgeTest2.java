package Ch001;

import java.util.Scanner;

public class AgeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수 입력");
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		age = sc.nextInt();
		
		if(age <19) {
			System.out.println("미성년");
		}else {
			System.out.println("성년");
		}
		}
	}



package Ch001;

import java.util.Scanner;

public class AgeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� �Է�");
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		age = sc.nextInt();
		
		if(age <19) {
			System.out.println("�̼���");
		}else {
			System.out.println("����");
		}
		}
	}



package Ch001;

import java.util.Scanner;

public class GradeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��� �Է�");
		Scanner sc = new Scanner (System.in);
		int a = 0;
		a = sc.nextInt();
		switch (a) {
		case 1 :
			System.out.println("���� ���߽��ϴ�.");
			break;
		case 2 :
		case 3 :
			System.out.println("���߽��ϴ�.");
			break;
		case 4 :
		case 5 :
		case 6 :
			System.out.println("�����Դϴ�.");
			break;
			
		default :
			System.out.println("�˸�û��");
		}
			
	}

}

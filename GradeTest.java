package Ch001;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		System.out.println("�ڽ��� ����� �Է��ϼ���.");
	Scanner sc = new Scanner(System.in);
	int Grade = 0;
	Grade = sc.nextInt();
	switch(Grade) {
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
		System.out.println("����� �ʿ��մϴ�.");
		}
	
	
	}
	
	
		 
			
		
	
	
	}
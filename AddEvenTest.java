package Ch001;

import java.util.Scanner;

public class AddEvenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int number = 0;
		do {
			System.out.print("���� ������ �Է��ϼ���. ������ �Է����� ������.");
			input = sc.nextInt();
			if(input%2==0) {
			number = number + input;
			}
			
		}while(input >=0);
		
		System.out.println(number);
	}
}
		
	

		

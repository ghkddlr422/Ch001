package Ch001;

import java.util.Scanner;

public class AddEventTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		do {
			System.out.print("양의 정수 입력, 음의 정수 입력 시 프로그램 종료.");
			input = sc.nextInt();
			if(input%2==1) {
				sum = sum + input;
				
			}
		}while(input>=0);
	System.out.println(sum);
	} 

}

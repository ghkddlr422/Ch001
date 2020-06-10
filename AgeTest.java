package Ch001;

import java.util.Scanner;

public class AgeTest {

	public static void main(String[] args) {
		
		System.out.println("정수를 입력하시오.");
	
		Scanner sc = new Scanner(System.in);
		
	int Age = 0;
		Age = sc.nextInt();
		
		if(Age>=19) 
		{
			System.out.println("성년");
		} else 
		{
			 
			System.out.println("미성년");
			
		}
		
	}

}

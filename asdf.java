package Ch001;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("구구단");
			for(int i = 1; i < 10; i++)
			{
				for(int j = 2; j < 10; j++)
				{
					System.out.print(j + "*" + i + "=" + (i*j) + "\t");
				}
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			System.out.println("1차원 배열 초기화");
			
			int[] arr; 					//배열 선언
			arr = new int[5]; 			//배열 생성
			
			int[] arr1 = {1,2,3};		//배열의 초기화
			
			System.out.println();
			System.out.println();
			System.out.println("int형 두개 선언 후 합구하기");
			
			int a = 3;
			int b = 5;
			System.out.println("두개의 합은 = " + (a + b));
			
			System.out.println();
			System.out.println();
			System.out.println("1~100까지의 합");
			
			int sum = 0;
			for(int i = 1; i < 101; i++) {
				sum += i;
			}
			System.out.println(sum);
			
			System.out.println();
			System.out.println();
			System.out.println("max값 구하기");
			
			int c = 10;
			int d = 9;
			int max = 0, min = 0;
			if( c > d)
			{
				max = c;
			}
			else {
				max = d;
			}
			System.out.println("max는 " + max);
			

}
}

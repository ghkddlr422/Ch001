package Ch001;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("������");
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
			System.out.println("1���� �迭 �ʱ�ȭ");
			
			int[] arr; 					//�迭 ����
			arr = new int[5]; 			//�迭 ����
			
			int[] arr1 = {1,2,3};		//�迭�� �ʱ�ȭ
			
			System.out.println();
			System.out.println();
			System.out.println("int�� �ΰ� ���� �� �ձ��ϱ�");
			
			int a = 3;
			int b = 5;
			System.out.println("�ΰ��� ���� = " + (a + b));
			
			System.out.println();
			System.out.println();
			System.out.println("1~100������ ��");
			
			int sum = 0;
			for(int i = 1; i < 101; i++) {
				sum += i;
			}
			System.out.println(sum);
			
			System.out.println();
			System.out.println();
			System.out.println("max�� ���ϱ�");
			
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
			System.out.println("max�� " + max);
			

}
}

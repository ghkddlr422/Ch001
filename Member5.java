package Ch001;

	public class Member5 {

	
		String name, tel, address;
		
		Member5() {
			this("no name");											//1.	2��°�� ����.
			System.out.println("�Ķ���� ���� �������� this() �� ");			//7.	����Ʈ�Ѵ�.
			System.out.println("------------------------------");
		}
			
		Member5(String name) {
			this("test", "222", "����");									//2.	3��°�� ����.
			System.out.println("�Ķ���� 1�� ���� �������� this() �� ");			//6.	����Ʈ�Ѵ�.
										
			System.out.println("name �Ķ���� : " + name);						//this.name �� �ȳ�����, String name���� ���Ƿ�
			System.out.println("this.name �Ķ���� : " + this.name);			//�������� ���� no name�� ����.
			System.out.println("this.tel �Ķ���� : " + this.tel);				//�� �����ڴ� Member5(String name) �̹Ƿ�	
			System.out.println("address �Ķ���� : " + address);				//name �� this.name�� ���൵ �ȴ�.
			System.out.println("------------------------------");
		}
		
		
		Member5(String name, String tel, String address) {
			System.out.println("�Ķ���� 3���� ���� ������ ȣ���");				//3.	����Ʈ�Ѵ�.
			this.name = name;											//4.	�ִ´�.
			this.tel = tel;
			this.address = address;
			System.out.println("3��° ��������. �� �Է� �Ϸ�!!");				//5.	����Ʈ�Ѵ�.
			System.out.println("------------------------------");
		}
		
		
		
		void print() {													//8.	m.print�� ���� ����Ʈ�Ѵ�.
			System.out.println("name : " +name);
			System.out.println("tel : " + tel);
			System.out.println("address : " + address);
		}
	}

package Ch001;

public class Member3 {
	String name;
	String tel;
	String address;
	
	Member3(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}/*this.name = name;
		 �º��� ������� name�� ��Ÿ����, �캯�� �������� name�� ��Ÿ��*/
		
		void print() {
			System.out.println("name : " + name);
			System.out.println("tel : " + tel);
			System.out.println("address : " + address);
		}
	}


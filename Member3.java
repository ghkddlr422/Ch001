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
		 좌변은 멤버변수 name을 나타내고, 우변은 지역변수 name을 나타냄*/
		
		void print() {
			System.out.println("name : " + name);
			System.out.println("tel : " + tel);
			System.out.println("address : " + address);
		}
	}


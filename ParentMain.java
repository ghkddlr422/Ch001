package Ch001;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.name = "�θ�";
		p.age = 50;
		p.setMoney(1000000);
		p.printParentInfo();
		System.out.println("money : " + p.getMoney());
		System.out.println("---------------------");
		
		Child c = new Child();
		c.name = "�ڽ�";
		c.age = 20;
		c.setHobby("��Ÿ");
		c.printParentInfo();
		c.printInfo();
			
		
	}

}

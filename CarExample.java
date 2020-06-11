package Ch001;

public class CarExample {

	public static void main(String[] args) {
	/*	//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고시속: "  + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
	*/	
	/*Car myCar = new Car("검정", 3000);
	//Car myCar = new Car(); */
	/*	Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("자가용", "빨강");
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		*/
	Car car1 = new Car();
	System.out.println("car1.company : " + car1.company);
	System.out.println();
	
	Car car2 = new Car("자가용");
	System.out.println("car2.company : " + car2.company);
	System.out.println("car2.model : " + car2.model);
	System.out.println();
	
	Car car3 = new Car("자가용", "빨강" );
	System.out.println("car3.company : " + car3.company);
	System.out.println("car3.model : " + car3.model);
	System.out.println("car3.color : " + car3.color);
	System.out.println();
	
	Car car4 = new Car("택시", "검정");
	System.out.println("car4.company : " + car4.company);
	System.out.println("car4.model : " + car4.model);
	System.out.println("car4.color : " + car4.color);
	System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}
}

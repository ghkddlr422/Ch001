package Ch001;

		 /*public class Car {
			//�ʵ�
			String company = "�����ڵ���";
			String model = "�׷���";
			String color = "����";
			int maxSpeed = 350;
			int speed; 

			
			
			
	} */

/*public class Car {
	//������
	Car(String color, int cc) 
	{
		
	}
}*/
/*	public class Car{
		//�ʵ�
		String company = "�����ڵ���";
		String model;
		String color;
		int maxSpeed;
		
		//������
		Car(){
		}
		
		Car(String model){
			this.model = model;
		}
		
		Car(String model, String color){
			this.model = model;
			this.color = color;
		}
		
		Car(String model, String color, int maxSpeed){
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
		
	}
	*/
	public class Car {
		//�ʵ�
		String company = "�����ڵ���";
		String model;
		String color;
		int maxSpeed;
		
		//������
		Car() {
		}
		
		Car(String model) {
			this(model, "����", 250);
		}
		
		Car(String model, String color) {
			this(model, color, 250);
		}
		
		Car(String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
		}
	}

	

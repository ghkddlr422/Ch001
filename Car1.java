package Ch001;

public class Car1 {
//�ʵ�
	private int speed;
	private boolean stop;
	
	//������
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
		}else {
			
		}this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
}

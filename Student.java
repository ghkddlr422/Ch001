package Ch001;
//person�� ��ӹ޴� studentŬ������ ����
public class Student extends Person {
	private String[] subjects;
	
	public void print_subj() {	//6~11���� subjects�� �迭�����¹�.
		System.out.println(name + " �л��� ������û ����");
		for (int i =0; i  < subjects.length; i++) {
			System.out.println("subject :" + subjects[i]);
		}
	}
	
	public String[] getSubjects() {//subjects�� getter
		return subjects;
	}
	
	public void setSubjects(String[] subjects) {//subjects�� setter
		this.subjects = subjects;
	}
}

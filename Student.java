package Ch001;
//person을 상속받는 student클래스를 정의
public class Student extends Person {
	private String[] subjects;
	
	public void print_subj() {	//6~11줄은 subjects의 배열요소출력문.
		System.out.println(name + " 학생의 수강신청 과목");
		for (int i =0; i  < subjects.length; i++) {
			System.out.println("subject :" + subjects[i]);
		}
	}
	
	public String[] getSubjects() {//subjects의 getter
		return subjects;
	}
	
	public void setSubjects(String[] subjects) {//subjects의 setter
		this.subjects = subjects;
	}
}

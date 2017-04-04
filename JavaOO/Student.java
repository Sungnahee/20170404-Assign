package JavaOO;

public class Student {
	String major;
	int num;
	
	public static void main(String[] args) {
		Student student = new Student();
		student.major = "컴퓨터정보공학과";
		student.num = 20164100;
		
		System.out.println("학과 : "+student.major+"\n학번 : "+student.num);

	}

}

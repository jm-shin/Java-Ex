package generic3;

public class StudentManagementTest {
	public static void main(String[] args) {
//		MyList<Student> myList = new MyLinkedList<Student>();
//		StudentManagement management =
//				new StudentManagement(myList);
//		management.start();
		StudentManagement2 management = new StudentManagement2();
		management.start();
	}
}

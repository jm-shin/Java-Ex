package generic3;

public class Student {
	public static int numOfStudent;
	//이름, 학년, 점수를 저장하는 클래스
	private String name;
	private int grade;
	private int score;
	public Student() {
		numOfStudent++;
		name = "이름없음";
		grade = 1;
		score = 0;
	}
	
	public static void printNumOfStudent() {
		System.out.println(numOfStudent);
	}
	
	public Student(String name,int grade, int score) {
		numOfStudent++;
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	public String toString() {
		return "이름 : " + name + ", 학년 : " + grade + ", 점수 : "+ score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

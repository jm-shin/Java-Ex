package generic3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement2 {
	// 학생정보를 삽입,조회,수정,삭제 할 수 있는 기능
	// 학생정보를 여러개를 관리해야 하고, >> StudentList 활용
	//Student를 Map<String,Object>로 바꿔주세요
	//MyList > java.util.List  
	private List<Map<String, Object>> studentList;
	private boolean isRun; // 프로그램 실행여부를 표시하는 변수(flag:상태 표시변수)
	private Scanner input = new Scanner(System.in);

	public StudentManagement2() {
		isRun = false;
		studentList = new ArrayList<Map<String,Object>>(); // 객체를 만들어서 초기화
	}
	public StudentManagement2(List<Map<String,Object>> studentList) {
		isRun = false;
		this.studentList = studentList;
	}
	// 메뉴보여주기
	private void showMenu() {
		System.out.println("*****번호를 선택하세요*******");
		System.out.println("* 1. 입력   2. 조회   3.수정   *");
		System.out.println("* 4. 삭제   5. 종료                *");
		System.out.println("*************************");
	}

	// 메뉴입력받기
	private void inputMenu() {
		int num = input.nextInt();
		input.nextLine();
		switch (num) {
		case 1:
			insert();
			break;
		case 2:
			select();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			isRun = false;
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}

	}

	// 프로그램 실행하기(반복적으로,isRun 변수의 값에 의해 결정됨)
	public void start() {
		isRun = true;
		while (isRun) {
			try {
				showMenu();
				inputMenu();				
			}catch(Exception e) {
				System.out.println("오류가 발생했습니다. 다시 시도하세요");
				input.nextLine();
			}
		}
	}
	private void insert() {
		//학생 정보 입력받아서 저장
		System.out.println("새로운 학생 정보를 입력합니다.");
		System.out.println("이름을 입력하세요");
		String name = input.nextLine();
		System.out.println("학년을 입력하세요");
		int grade = input.nextInt();
		System.out.println("점수를 입력하세요");
		int score = input.nextInt();
		//입력받은 정보를 studentList에 저장하기
		//studentList에 저장하기 위해서 Student객체를 하나 만듬
//		Student student = new Student(name, grade, score);
		//학생한명 정보를 Student 객체에 저장
		//>>>Map<String,Object> 객체에 저장
		Map<String, Object> student 
		   = new HashMap<String, Object>();
		student.put("name",name);
		student.put("grade", grade);
		student.put("score", score);
		studentList.add(student);
	}
	private void select() {
		//저장된 학생 정보 조회
		//1. 전체조회  2.이름검색
		System.out.println("종류를 선택하세요.");
		System.out.println("1. 전체조회     2. 이름조회");
		int number = input.nextInt();
		input.nextLine();
		if(number == 1) {
			//전체조회 : studentList의 모든 인덱스를 차례대로 출력
			for(int i=0;i<studentList.size();i++) {
				Map<String, Object> student = studentList.get(i);
				System.out.println("["+i+"]" 
				+ "이름 : "+ student.get("name") +", 학년 : " + student.get("grade")
				+", 점수 : " + student.get("score"));
			}
		}else if(number ==2) { //이름조회
			System.out.println("이름을 입력하세요.");
			String keyword = input.nextLine();
			//학생의 이름과 keyword가 같거나  keyword를 포함하는 이름을 조회
			//모든 요소를 한번씩 접근하면서 바로 출력하는 것이 아니라
			//이름확인해서 키워드와 같거나 포함하면 출력
			for(int i=0;i<studentList.size();i++) {
				Map<String, Object> s = studentList.get(i);
				String name = (String)s.get("name");
				if(name.contains(keyword)) {
					System.out.println(s);
				}
			}
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
	}
	private void update() {
		//저장된 학생 정보 수정 : 점수만 수정하도록
		//1. 수정하려고 하는 학생 선택해서
		//2. 수정 정보 입력받고
		//3. 정보 수정하기 
		System.out.println("수정하려는 학생의 번호를 입력하세요.");
		for(int i =0;i<studentList.size();i++) {
			System.out.println("["+i+"]" + studentList.get(i));
		}
		int num = input.nextInt();
		Map<String, Object> s = studentList.get(num);
		System.out.println("수정하려는 점수를 입력하세요.");
		int score = input.nextInt();
		 //"score" key의 value를 변경, 같은 키로 value를 넣으면 덮어쓰기 
		s.put("score", score);
		System.out.println("수정되었습니다.");
	}
	private void delete() {
		//저장된 학생 정보 삭제 
		//1. 학생목록 보여주고
		//2. 삭제할 학생번호 입력받고
		//3. 해당 학생 목록에서 삭제
		System.out.println("삭제하려는 학생의 번호를 입력하세요.");
		for(int i=0;i<studentList.size();i++) {
			System.out.println("["+i+"]" + studentList.get(i));
		}
		int num = input.nextInt();
		studentList.remove(num);
		System.out.println("삭제되었습니다.");
	}
	
}








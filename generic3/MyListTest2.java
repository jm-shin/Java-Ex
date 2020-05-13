package generic3;

public class MyListTest2 {
	public static void main(String[] args) {
		//LinkedList : 데이터 자료형에 상관없이 저장
		//데이터를 Node 객체에 저장한다. 
		//Node클래스가 Generic으로 선언되어야 한다. 
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("C");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		//사용하려는 데이터 타입을 Object로 정의해서 사용하는 경우가 많다. 
		//Object로 데이터 타입을 정의하면 다양한 데이터를 한꺼번에 저장할 수 있다.
		MyLinkedList<Object> list2 = new MyLinkedList<Object>();
		list2.add("Hello!!");
		list2.add(123);
		list2.add(10.3);
		list2.add(new MyArrayList<String>());
		
		for(String s:list) {
			System.out.println(s);
		}
		
		
		
		
		
		
	}
}

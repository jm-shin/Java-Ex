package generic3;

public class MyListTest {
	public static void main(String[] args) {
		
		MyArrayList<String> myList = new MyArrayList<String>();
		myList.add("H");
		myList.add("E");
		myList.add("L");
		myList.add("L");
		myList.add("O");
		System.out.println(myList);
		for(String s:myList) {
			System.out.println(s);
		}
				
	}
}

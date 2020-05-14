package aop;

public class AopTest {
	public static void main(String[] args) {
//		Boy b = new Boy();
//		b.doSomething();
//		Girl g = new Girl();
//		
//		g.doSomething();
		Person p = new PersonProxy(new Boy());
		
		p.doSomething();
		
	}
}

package aop;

public class PersonProxy implements Person{
	private Person p;
	
	public PersonProxy(Person p) {
		this.p = p;
	}
	
	public void doSomething() {
		System.out.println("지하철을 탄다.");
		p.doSomething();
		System.out.println("계산을 하고 집에 온다.");
		System.out.println("씻고 잠을 잔다.");
	}
}
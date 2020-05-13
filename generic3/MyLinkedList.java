package generic3;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E>,Iterable<E> {
	private int size;
	private Node<E> head;
	public MyLinkedList() {
		size=0;
		head = null;
	}
	@Override
	public void add(E value) {
		//첫번째 요소에 대한 add이면 head에 추가
		//아니면, 맨마지막 요소에 추가 
		//첫번째 요소인지 아닌지 판단 >> head가 null 인지 아닌지
		Node<E> newNode = new Node<E>();
		newNode.setData(value);
		if(head == null) {
			//head 에 달기
			head = newNode;
		}else {
			//마지막 요소에 달기
			Node<E> tmpNode = head;
			while(tmpNode.next()!=null) {
				tmpNode = tmpNode.next();
			}
			//while문이 끝나는 조건 : tmpNode.next() == null
			//tmpNode의 다음요소가 없다 == 마지막요소
			tmpNode.setNext(newNode);
		}
		size++;
		
	}
	@Override
	public E get(int idx) {
		Node<E> target = head;
		for(int i=0;i<idx;i++) {
			target = target.next();
		}
		return target.getData();
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public void delete(int idx) {
		Node<E> target = head;
		Node<E> prev =null;
		for(int i=0;i<idx;i++) {
			prev = target;
			target = target.next();
		}
		if(idx == 0) {
			//헤드 삭제 : head의 다음요소를 새로운 head로 만들어주기
			head = head.next();
		}else {
			//삭제하려는 요소의 참조 없애주기 
			prev.setNext(target.next());
		}
		size--;
	}
	@Override
	public void replace(int idx, E value) {
		Node<E> target = head;
		for(int i=0;i<idx;i++) {
			target = target.next();
		}
		target.setData(value);
	}
	//Iterator : 요소를 하나씩 가리키면서 반환하는 기능을 가지는 객체
	//모든 요소에 한 번씩만 접근하면서 해당 요소를 반환
	@Override
	public Iterator<E> iterator() {
		//얘가 하는일은 Iterator를 만들어서 반환
		Iterator<E> it = null;
		//next를 호출할 때마다 다음 요소를 반환하는 객체
		it = new Iterator<E>() {
			//숫자 하나를 가지면서 현재 반환한 인덱스를 가지고 있으면 됨
			int current=0;
			@Override
			public boolean hasNext() {
				//다음요소가 있으면 true, 없으면 false 반환
				// size    : 3   5  0  1
				// current : 2   4  0  0
				if(current > size-1) {
					return false;
				}
				return true;
			}
			@Override
			public E next() {
				// TODO Auto-generated method stub
				//다음요소를 반환
				Node<E> tmpNode = head;
				for(int i =0;i<current;i++) {
					tmpNode = tmpNode.next();
				}
				current++;
				return tmpNode.getData();
			}
		};
		return it;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

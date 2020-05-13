package generic3;

public class Node<T> {
	//데이터 하나, 다음 노드 주소값
	private T data;
	private Node<T> next;
	public void setData(T data) {
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public Node<T> next(){
		return this.next;
	}
	public String toString() {
		return data.toString();
	}
}

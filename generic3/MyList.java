package generic3;

public interface MyList<E>{
	public void add(E value); //	 add(E value):void    리스트의 마지막에 정수 추가
	public E get(int idx); //	 get(int idx):E       인자로 받은 인덱스에 있는 정수 반환
	public int size(); //	 size():int             리스트의 크기 반환
	public void delete(int idx); //	 delete(int idx):void   인자로 받은 인덱스에 있는 정수를 리스트에서 삭제
	public void replace(int idx,E value); //	 replace(int idx,E value):void     인자와 값을 받아서 해당 인덱스에 값을 교체
}

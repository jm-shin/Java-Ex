package generic3;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E>, Iterable<E> {
	private E[] arr;

	public MyArrayList() {
		// 0칸짜리 배열 생성
		// 배열 객체를 만들 때는 임의 데이터 타입이 허용되지 않음
		arr = (E[]) new Object[0];
	}

	@Override
	public void add(E value) {
		E[] newArr = (E[]) new Object[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = value;
		arr = newArr;
	}

	@Override
	public E get(int idx) {
		return arr[idx];
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public void delete(int idx) {
		E[] newArr = (E[]) new Object[arr.length - 1];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i != idx) {
				newArr[count] = arr[i];
				count++;
			}
		}
		arr = newArr; // 배열 교체
	}

	@Override
	public void replace(int idx, E value) {
		arr[idx] = value;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i < arr.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");

		return sb.toString();
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> it = new Iterator<E>() {
			int count =0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if(count < arr.length) {
					return true;
				}
				return false;
			}
			@Override
			public E next() {
				try{
					return arr[count];
				}finally {
					count++;
				}
			}
		};
		return it;
	}

}

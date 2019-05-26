package com.test.any;
/**
 * ������ģ��ջ��ʵ��
 * @author ����
 *
 */

public class ArrayStack {
	static int[] arr = new int[10];
	int index = 0;//ջ��Ԫ�صĺ�һλ

	// ѹ��Ԫ��
	public void push(int element) {
		arr[index] = element;
		index++;

		if (index >= arr.length) {// �������ķ�Χ����������ĳ���
			int[] newArr = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}

	}

	// ����Ԫ��
	public int pop() {
		
		int element = arr[index - 1];
		int[] arr2 = new int[index - 1];

		for (int i = 0; i < index - 1; i++) {
			arr2[i] = arr[i];
		}
		arr = arr2;
		index--;

		
		return element;
	}

	/**
	 * ��������Ĵ�С
	 */
	public int size() {
		return index - 1;
	}

	/**
	 * �������
	 */
	public void clear() {
		int[] arr2 = new int[arr.length];
		arr = arr2;
	}

	public static void main(String[] args) {
		ArrayStack as = new ArrayStack();
		as.push(1);
	as.push(2);
		as.push(3);
		as.push(4);
		as.push(1);
		as.push(2);
		as.push(3);
		as.push(4);
		as.push(5);
		as.push(6);
		as.push(7);

		System.out.println("ջ�׵�����Ϊ��");
		System.out.println(as.pop());
		System.out.println("��ʱջ�е�Ԫ���ǣ�");
		for (int a : arr) {
			System.out.println(a);
		}

	}
}

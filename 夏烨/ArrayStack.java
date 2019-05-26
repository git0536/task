package com.test.any;
/**
 * 用数组模拟栈的实现
 * @author 夏烨
 *
 */

public class ArrayStack {
	static int[] arr = new int[10];
	int index = 0;//栈顶元素的后一位

	// 压入元素
	public void push(int element) {
		arr[index] = element;
		index++;

		if (index >= arr.length) {// 如果插入的范围超出了数组的长度
			int[] newArr = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}

	}

	// 弹出元素
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
	 * 返回数组的大小
	 */
	public int size() {
		return index - 1;
	}

	/**
	 * 清空数组
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

		System.out.println("栈底的数据为：");
		System.out.println(as.pop());
		System.out.println("此时栈中的元素是：");
		for (int a : arr) {
			System.out.println(a);
		}

	}
}

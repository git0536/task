package com.text.access;

public class ArrayStack {
	int array[]=new int[10];//定义数组
	int index=0;//设置栈顶元素
	/*
	 * 判断栈是否为空
	 */
	public boolean isEmpty(){
		return index==0;
		
	}
	//往栈中压入元素
	public void push(int element) {
		array[index]=element;
		index++;
		if(index >=array.length) {                //如果栈满了 要扩容
		int [] newarray= new int [array.length*2];
		for (int i = 0; i < array.length; i++) {
			newarray[i]=array[i];	
		}
		array=newarray;
		}
	}
	/*
	 *弹出元素
	 */
	public int pop() {
		index--;
		return array[index];
	}
	/*
	 * 返回长度
	 */
	public int size() {
		return index+1;
	}
	/*
	 * 清除元素
	 */
	public void clear() {
		index=0;
	}
    public static void main(String args[]) {
    	ArrayStack array3= new ArrayStack();
    	array3.push(1);
    	array3.push(2);
    	array3.push(3);
    	array3.push(4);
    	array3.push(5);
    	System.out.println(array3.size());
    	System.out.println(array3.pop());
    	
    	
    }
}

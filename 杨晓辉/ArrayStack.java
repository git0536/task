package com.text.access;

public class ArrayStack {
	int array[]=new int[10];//��������
	int index=0;//����ջ��Ԫ��
	/*
	 * �ж�ջ�Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return index==0;
		
	}
	//��ջ��ѹ��Ԫ��
	public void push(int element) {
		array[index]=element;
		index++;
		if(index >=array.length) {                //���ջ���� Ҫ����
		int [] newarray= new int [array.length*2];
		for (int i = 0; i < array.length; i++) {
			newarray[i]=array[i];	
		}
		array=newarray;
		}
	}
	/*
	 *����Ԫ��
	 */
	public int pop() {
		index--;
		return array[index];
	}
	/*
	 * ���س���
	 */
	public int size() {
		return index+1;
	}
	/*
	 * ���Ԫ��
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

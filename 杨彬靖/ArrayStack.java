package homework01;

import java.util.Arrays;

class ArrayStack{
	private int[] arr;
	private int index;
	
	//初始化对象
	public ArrayStack(){
		arr=new int[0];
		index=0;
	}
	
	//数据入栈
	public void push(int element){
		arr=Arrays.copyOf(arr,index+1);
		arr[index]=element;
		index++;
	}
	
	//如果栈为空返回0，否则返回栈顶元素
	public int pop(){
		if(index==0){
			System.out.println("Stack is empty!");
			return 0;
		}else{
			int element;
			element=arr[index-1];
			arr=Arrays.copyOf(arr,index-1);
			index--;
			return element;
		}
	}
	
	//返回栈内元素个数
	public int size(){
		return index;
	}
	
	//清空栈
	public void clear(){
		arr=Arrays.copyOf(arr,0);
		index=0;
	}
	
	//显示栈内元素
	public void show(){
		for(int i:arr){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
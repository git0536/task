import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
	
	private static final int INCREASE_LENGTH = 5; //每次增加的长度
	
	private int[] arr;	//存储数据
	private int topIndex; 	//栈顶位置
	private int maxSize;	//最大容量
	
	/**
	 * creates a stack with initial value, null is enabled.
	 * @param args
	 */
	public ArrayStack(int ...args) {
		arr = args;
		topIndex = arr.length - 1;
		maxSize = arr.length;
	}
	
	/**
	 * Pushes an item onto the top of this stack.
	 * @param value to be pushed onto the stack
	 */
	public void push (int value) {
		if (size() == maxSize) {
			//数组变长
			maxSize = size() + INCREASE_LENGTH;
			arr = Arrays.copyOf(arr, maxSize);
		}
		arr[++topIndex] = value;
	}
	
	/**
	 * Removes the value at the top of this stack and returns that value.
	 * @return	value at the top of stack
	 */
	public int pop () {
		if (size() == 0)
			throw new EmptyStackException();
		
		return arr[topIndex--];
		
	}
	
	/**
	 * tests if the stack is empty.
	 * @return	true if and only if the stack has no value; false otherwise.
	 */
	public boolean isEmpty () {
		return topIndex == -1;
	}
	
	/**
	 * returns the number of values in this stack.
	 * @return	the number of values in this stack
	 */
	public int size () {
		return topIndex + 1;
	}
	
	/**
	 * clears this stack.
	 */
	public void clear () {
		topIndex = -1;
	}
	
	//test
	public static void main(String[] args) {
		ArrayStack s = new ArrayStack();
		
		s.push(3);
		s.push(2);
		s.push(7);
		
		System.out.println("size: " + s.size());

		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
	}
}

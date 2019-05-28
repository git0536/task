public class ArrayStack {
	int[] arr;
	int index;

	public ArrayStack(int size) {
		if (size < 0) {
			System.out.println("size不能小于0");
		} else
			arr = new int[size]; // 初始化数组
		index = 0;
	}

	public int pop() {
		if (index == 0) {
			System.out.println("栈为空"); // 出栈
		}
		index--;
		return arr[index];

	}

	public void push(int element) {
		if (index == arr.length) {
			System.out.println("栈已满");// 入栈
		}
		arr[index] = element;
		index++;

	}

	public int size() { // 返回大小
		return index;

	}

	public void clear() {
		int arr2[] = new int[0];
		arr = arr2;
	}

	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(6);

		for (int i = 10; i <= 50; i = i + 10) {
			st.push(i);                        //入棧

		}                                  //index=5
		System.out.println(st.size());

			//int s = st.pop();
			//System.out.println(s);              //出棧
	       // int j=st.pop();
	        //System.out.println(j);	
	        int k=5;
	        while(k!=0) {
	        	int s = st.pop();
	        	System.out.println(s); 
	        	k--;
	        }
		
		st.clear();
		 int g=5;
	        while(g!=0) {
	        	int s = st.pop();
	        	System.out.println(s); 
	        	g--;
	        }
	}
}
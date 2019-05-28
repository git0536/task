public class ArrayStack {
	int[] arr;
	int index;

	public ArrayStack(int size) {
		if (size < 0) {
			System.out.println("size����С��0");
		} else
			arr = new int[size]; // ��ʼ������
		index = 0;
	}

	public int pop() {
		if (index == 0) {
			System.out.println("ջΪ��"); // ��ջ
		}
		index--;
		return arr[index];

	}

	public void push(int element) {
		if (index == arr.length) {
			System.out.println("ջ����");// ��ջ
		}
		arr[index] = element;
		index++;

	}

	public int size() { // ���ش�С
		return index;

	}

	public void clear() {
		int arr2[] = new int[0];
		arr = arr2;
	}

	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(6);

		for (int i = 10; i <= 50; i = i + 10) {
			st.push(i);                        //�뗣

		}                                  //index=5
		System.out.println(st.size());

			//int s = st.pop();
			//System.out.println(s);              //����
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
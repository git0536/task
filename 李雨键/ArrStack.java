package Exercise;
public class ArrStack {
	int[] arr;
    private int size;
    private int top;
    public  ArrStack(int size)//���캯��
    {
    	this.size=size;//���췽��
        arr=new int[size];//��ʼ������
        top=-1;//��ʼ��ջ��
    }
    public int getSize()
    {   
        return size;
    }
    public int getTop()
    {
        return top;
    }
    
    //�ж��Ƿ��ǿ�ջ
    public boolean isEmpty( )
      {    
    	return top == -1;//�ж�top�Ƿ���-1�������-1�򷵻�true		
      }
     //�Ƿ�Ϊ��ջ   
    public boolean isFull()
    {
        return (top+1)==size;
    }
        
    
    /*ѹջ���� 
     * �����ջ
     * �����ջ���� 
     * ����
     * ����ѹջ����
     */
    public int[] push(int element)
    {
    	if(isFull()){
    		System.out.println("ջ����");     
    		}
    	else{
    		top++;
            this.arr[top]=element;              
            }
		return arr;
    }
    /*��ջ���� 
     * �����ջ
     * �����ջΪ��
     * ����
     * ���г�ջ����
     */
    public int pop() 
    {
    	int ArrTop = 0;
    	if(isEmpty()) {
        
    		System.out.println("ջΪ��");
    		}    	
        
        else {
            ArrTop=this.arr[top];//��ջ������ArrTop
            top--;
            }
    	
    	return ArrTop;
       
    }
    //���س���
    public int size()
    {
    	return this.arr.length;
    }
            
    public static void main(String[] args) {
        ArrStack Stack=new ArrStack (5);//����ArrStack����������һ��Stackջ
        
        //��ջ
        for(int i=0;i<Stack.size;i++)
        {
        	Stack.push(i);

        }
        
        //��ջ
        while(!Stack.isEmpty()){
        	System.out.println(Stack.pop());

        	}
        
        //�������
       System.out .println("��ջ�ĳ��ȣ�"+Stack.size);
    }
}
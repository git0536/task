package Exercise;
public class ArrStack {
	int[] arr;
    private int size;
    private int top;
    public  ArrStack(int size)//构造函数
    {
    	this.size=size;//构造方法
        arr=new int[size];//初始化数组
        top=-1;//初始化栈顶
    }
    public int getSize()
    {   
        return size;
    }
    public int getTop()
    {
        return top;
    }
    
    //判断是否是空栈
    public boolean isEmpty( )
      {    
    	return top == -1;//判断top是否是-1，如果是-1则返回true		
      }
     //是否为满栈   
    public boolean isFull()
    {
        return (top+1)==size;
    }
        
    
    /*压栈操作 
     * 如果满栈
     * 输出：栈满了 
     * 否则
     * 进行压栈操作
     */
    public int[] push(int element)
    {
    	if(isFull()){
    		System.out.println("栈满了");     
    		}
    	else{
    		top++;
            this.arr[top]=element;              
            }
		return arr;
    }
    /*弹栈操作 
     * 如果空栈
     * 输出：栈为空
     * 否则
     * 进行出栈操作
     */
    public int pop() 
    {
    	int ArrTop = 0;
    	if(isEmpty()) {
        
    		System.out.println("栈为空");
    		}    	
        
        else {
            ArrTop=this.arr[top];//将栈顶赋给ArrTop
            top--;
            }
    	
    	return ArrTop;
       
    }
    //返回长度
    public int size()
    {
    	return this.arr.length;
    }
            
    public static void main(String[] args) {
        ArrStack Stack=new ArrStack (5);//调用ArrStack函数，定义一个Stack栈
        
        //入栈
        for(int i=0;i<Stack.size;i++)
        {
        	Stack.push(i);

        }
        
        //出栈
        while(!Stack.isEmpty()){
        	System.out.println(Stack.pop());

        	}
        
        //输出长度
       System.out .println("此栈的长度："+Stack.size);
    }
}
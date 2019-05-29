package homework01;

public class Main{
	public static void main(String[] args){
		ArrayStack arr=new ArrayStack();
		
		for(int i=0;i<10;i++){
			System.out.println("push");
			arr.push((int)(Math.random()*100));
			System.out.println("now stack has "+arr.size()+" items");
			System.out.println("now stack is:");
			arr.show();
		}
		
		System.out.println("clear");
		arr.clear();
		System.out.println("now stack has "+arr.size()+" items");
		System.out.println("now stack is:");
		arr.show();
		
		for(int i=0;i<10;i++){
			System.out.println("push");
			arr.push((int)(Math.random()*100));
			System.out.println("now stack has "+arr.size()+" items");
			System.out.println("now stack is:");
			arr.show();
		}
		
		for(int i=0;i<12;i++){
			System.out.println("pop");
			int element=arr.pop();
			System.out.println("get number:"+element);
			System.out.println("now stack has "+arr.size()+" items");
			System.out.println("now stack is:");
			arr.show();
		}
	}
}
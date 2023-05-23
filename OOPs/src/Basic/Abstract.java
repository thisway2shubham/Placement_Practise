package Basic;

public abstract class Abstract {
	
	public int a;
	private int b;
	int c;
	protected int d;
	
	Abstract(){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	private void Demo3() {
		
	}
		
	
     
	protected void Demo4() {
		
	}
	
	public abstract void Demo();
	
	public void Demo2() {
	  System.out.println("Demo2 method");	
		
	}
	
	public class Child extends Abstract{
		
		public void Demo() {
			System.out.println("Child class demo");
		}
		
		public void Demo2() {
			System.out.println("Child class Demo 2 method");
		}
		
	}

	
	public static void main(String [] args) {
	
//		Abstract abs=new Abstract();     object creation of abstract class  
		                               //can not be possible 
	
		Child cc=new Child();
		System.out.println();
		
		
		
		
	}
}

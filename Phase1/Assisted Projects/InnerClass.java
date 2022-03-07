package AssistedProject;


public class InnerClass {
	
	private int data = 66;
	
	void display(){
		System.out.println("i am inside the outer clas method");
	}
	
	class Inner{
		private int data = 77;
		
		void msg(){
			InnerClass.this.display();
			System.out.println("data is "+ data);
		}
		
		void display(){
			System.out.println("i am the inner class method");
		}
	}
	
	public static void main(String[] args)
	{
		
		InnerClass obj = new InnerClass();
		
		InnerClass.Inner in = obj.new Inner();
		in.msg();
		in.display();
	}
}



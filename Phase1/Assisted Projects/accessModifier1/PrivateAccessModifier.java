package accessModifier1;

class privatAccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class PrivateAccessModifier {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		privatAccessspecifier  obj = new privatAccessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}
}
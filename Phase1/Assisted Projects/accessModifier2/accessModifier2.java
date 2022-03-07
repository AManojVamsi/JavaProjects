package accessModifier2;
import accessModifier1.*;
public class accessModifier2 extends ProtectedAccessModifier {

	public static void main(String[] args){
		accessModifier2 obj = new accessModifier2 ();   
	      obj.display();  
		PublicAccessModifier obj1= new PublicAccessModifier();
	       obj1.display1();
	}


}
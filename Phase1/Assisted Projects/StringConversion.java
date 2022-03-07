package AssistedProject;

public class StringConversion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Methods of Strings");
    String sl = new String("Hello World");
    System.out.println(sl.length());
    
    String sub = new String("Welcome");
    System.out.println(sub.substring(2));
     
    String s1 = "Hello";
    String s2 = "Heldo";
    System.out.println(s1.compareTo(s2));
    
    String s4 = "";
    System.out.println(s4.isEmpty());
    
    String s5 = "Hello";
    System.out.println(s1.toLowerCase());
    
    
   String s6 = "Heldo";
   String replace = s2.replace('d','l');
   System.out.println(replace);
   
   String x = "Welcome to Java";
   String y = "WeLcOME tO iaVa";
   System.out.println(x.equals(y));
   
   System.out.println("\n");
   
   System.out.println("Creating StringBuffer");
   
   StringBuffer s = new StringBuffer("Welcome to Java!");
   s.append("ENjoy your learning");
   System.out.println(s);
   
   s.insert(0, 'w');
   System.out.println(s);
   
   StringBuffer sb = new StringBuffer("Hello");
   sb.replace(0, 2, "hEl");
   System.out.println(sb);
   
    sb.delete(0,1);
    System.out.println("Creating StringBuffer");
    
    StringBuilder sb1 = new StringBuilder("Happy");
    sb1.append("learning");
    System.out.println(sb1);
    
    System.out.println(sb1.delete(0, 1));
    
    System.out.println(sb1.insert(1, "Welcome"));
    System.out.println(sb1.reverse());
    
    System.out.println("\n");
    System.out.println("Conversion of strings to StringBuffer and StringBuilder");
    String str = "Hello";
    
    
    StringBuffer sbr = new StringBuffer(str);
    sbr.reverse();
    System.out.println("String to StringBuffer");
    System.out.println(sbr);
    
    StringBuilder sbl= new StringBuilder(str);
    sb1.append("world");
    System.out.println("String to StringBuilder");
    System.out.println(sbl);
    
	}

}

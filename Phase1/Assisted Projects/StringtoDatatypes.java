package AssistedProject;

public class StringtoDatatypes {

	
	public static void main(String[] args)
	{
		String str = "1000";
		String longStr = "14567755";
		String floatStr = "49.36";
		String doubleStr = "99.358";
		
		int inumber = Integer.parseInt(str);
		long ilong = Long.parseLong(longStr);
		float ifloat = Float.parseFloat(floatStr);
		double idouble = Double.parseDouble(doubleStr);
		
		
		System.out.println(inumber);
		System.out.println(ilong);
		System.out.println(ifloat);
		System.out.println(idouble);
	}
	
	}


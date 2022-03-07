package AssistedProject;

public class Areacalc {
	
	double rad;
	int len;;
	int bre;
	int sidelen;
	
	public Areacalc()
	{
		System.out.println("calculating area of different shapes");
	}
	public Areacalc(double radius)
	{
		rad = radius;
	}
	
	public Areacalc(int len,int bre)
	{
		this.bre = bre;
		this.len = len;
	}
	
	public Areacalc(int side)
	{
		sidelen = side;
	}
	
	public static void main(String[] args) throws Exception
	{
		
		Areacalc a1 = new Areacalc();
		Areacalc circle = new Areacalc(2.3);
		Areacalc square = new Areacalc(5);
		Areacalc rectangle = new Areacalc(5,8);
		System.out.println(" area of square is : "+square.squareArea(square.sidelen));
		System.out.println(" area of rectangle is :"+rectangle.rectangleArea(rectangle.bre,rectangle.len));
		System.out.println("area of circle is :"+circle.circleArea(circle.rad));
	}
	
		double circleArea(double x){
			return 3.14*x*x;
		}
		
		double squareArea(int s){
			return (double)s*s;
		}
		
		int rectangleArea(int x, int y){
			return x*y;
		
	}
}

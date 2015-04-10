package lesson4;

public class Rectangle {
	private double lg;
	private double wide;
	private double area;
	private String colour;
	
	public Rectangle(double _lg,double _wide,String _colour){
		lg = _lg;
		wide = _wide;
		colour = _colour;	
	}
	
	public Rectangle(double _lg,double _wide){
		lg = _lg;
		wide = _wide;
		colour = "red";
	}
	
	public Rectangle(double _lg){
		lg = _lg;
		wide = 10.0;
		colour = "black";		
	}
	
	public Rectangle(){
		lg = 15.2;
		wide = 10.0;
		colour = "black";
		
	}
	
	public void SetLg(double _lg){
		lg = _lg;
	}
	
	public void SetWide(double _wide){
		wide = _wide;
	}
	
	public void SetColour(String _colour){
		colour = _colour;
	}
	
	public void printInfo(){
		System.out.println("lg:"+ lg);	
		System.out.println("wide:"+ wide);
		System.out.println("colour:"+ colour);
		get_area();
		System.out.println("area:"+ area);
	}
	
	public double get_area(){
		area = lg*wide;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4.5,10.2,"red");
		r1.printInfo();
		
		Rectangle r2 = new Rectangle(7.6,9.5);
		r2.printInfo();
		
		Rectangle r3 = new Rectangle(8.5);
		r3.printInfo();
		
		Rectangle r4 = new Rectangle();
		r4.printInfo();

	}

}

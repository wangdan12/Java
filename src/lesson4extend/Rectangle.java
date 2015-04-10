package lesson4extend;

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

	}

}

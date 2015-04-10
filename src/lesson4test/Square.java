package lesson4test;


public class Square {
	private double length;
	private String colour;
	private double area;
	
	public Square(double _length,String _colour){
		length = _length;
		colour = _colour;	
	}
	
	public Square(double _length){
		length = _length;
		colour = "red";	
	}
	
	public Square(){
		length = 4.5;
		colour ="black";	
	}
	
	public void SetLength(double _length){
		length = _length;
	}
	
	public void SetColour(String _colour){
		colour = _colour;
	}
	
	public void printInfo(){
		System.out.println("length:"+ length);	
		System.out.println("colour:"+ colour);
		get_area();
		System.out.println("area:"+ area);
	}
	
	public double get_area(){
		area = length*length;
		return area;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square r1 = new Square(5.9,"red");
		r1.printInfo();
		
		Square r2 = new Square(7.0);
		r2.printInfo();
		
		Square r3 = new Square();
		r3.printInfo();

	}

}

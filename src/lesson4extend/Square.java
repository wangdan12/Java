package lesson4extend;

public class Square extends Rectangle{
	public Square(double side, String colour){
		super(side, side, colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(20,"black");
		s.printInfo();
	}

}

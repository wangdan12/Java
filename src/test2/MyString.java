package test2;

public class MyString {
	private String x;
	private int i;
	public MyString(String _x){
		x = _x;	
	}
	
	public MyString(){
	  x = "xyz";
	}
	
	public int length(){
		for(i = 0;i<x.length();i++){
			
		}
		 return i;
	}
	
	public String reverse(String x){
		 int length = x.length();
		 if (length <= 1)
		 return x;
		 String left = x.substring(0, length / 2);
		 String right = x.substring(length / 2, length);
		 return reverse(right) + reverse(left);
	}
	
	public void concat(MyString newstring){
		x = x.concat(newstring.toValue());
	}
	
	public void lower(){
		String tmp="";
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)<='z'&& x.charAt(i)>='a'){
				tmp += x.charAt(i);
			}
			else{
				tmp +=(char)(x.charAt(i) + 32);
			}
				
		}
		x = tmp;
		}
			
	
	public void upper(){
		String tmp="";
		for(int i=0;i<x.length();i++){
			if(x.charAt(i)<='Z'&& x.charAt(i)>='A'){
				tmp += x.charAt(i);
			}
			else{
				tmp +=(char)(x.charAt(i)- 32);
			}
				
		}
		x = tmp;
		
	}
	
	public String toValue(){
		return x;
	}
	
	
	public void Print(){
	    reverse(x);
		System.out.println(reverse(x)); 
		System.out.println(x.length());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyString x = new MyString("abc");
		MyString y = new MyString("xyz");
		
		System.out.println(x.toValue()); 
		System.out.println(x.length()); 
	
	    x.Print();
	    
	    x.upper();
		System.out.println(x.toValue()); // Êä³öABC
		
		x.lower();
		System.out.println(x.toValue()); // Êä³öabc
		
		x.concat(y);
		System.out.println(x.toValue()); 
		
		
	}

}

package lesson3;

public class Man {
	private String name;
	private int age;
	private int height;
	private String gender;
	
	public Man(String _name,int _age,int _height,String _gender){
		name = _name;
		age = _age;
		height = _height;
		gender = _gender;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public int getHeight(){
		return height;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public boolean canMerry(){
		if((gender=="male"&&age>=22)||(gender=="female"&&age>=20))
			return true;
		else
			return false;
	}
	
	public void Print(){
		System.out.println("nsme:" + name);
    	System.out.println("age:"+age);
    	System.out.println("height:"+height);	
    	System.out.println("gender:"+gender);	
    	if(canMerry())
    		System.out.println("I can Merry");
    	else
    		System.out.println("I cannot Merry");
	}
	
}

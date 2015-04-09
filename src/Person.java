
public class Person {

	private String name;
	private String gender;
	private int age;
	private int height;
	
	public Person(String _name,String _gender,int _age,int _height){
		 name = _name;
		 gender = _gender;
		 age = _age;
		 height = _height;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	
	public int getAge(){
		return this.age;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public boolean canMerry(){
		if((gender=="male"&&age>=22)||(gender=="female"&&age>=20))
			return true;
		else
			return false;
	}
	
    public void Print(){
    	System.out.println("nsme:" + name);
    	System.out.println("gender:" + gender);
    	System.out.println("age:"+age);
    	System.out.println("height:"+height);
    	if(canMerry())
    		System.out.println("I can Merry");
    	else
    		System.out.println("I cannot Merry");
    	
    }
	
	public static void main(String[] args) {
		Person name = new Person("xiaoming","female",18,176);
		name.Print();

	}

}

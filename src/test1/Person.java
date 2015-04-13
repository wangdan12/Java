package test1;



public class Person {

	private String name;
	private String gender;
	private int age;
	private int height;
	private Leg legs[];
	private Hand hands[];
	
	public Person(String _name,String _gender,int _age,int _height,Leg _legs[],Hand _hands[]){
		 name = _name;
		 gender = _gender;
		 age = _age;
		 height = _height;
		 legs = _legs;
		 hands = _hands;
		 
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
    	System.out.println("name:" + name);
    	System.out.println("gender:" + gender);
    	System.out.println("age:"+age);
    	System.out.println("height:"+height);
    	if(canMerry())
    		System.out.println("I can Merry");
    	else
    		System.out.println("I cannot Merry");
    	
    	
    	for(int i=0;i<legs.length;i++){
    			System.out.println("legs weight:" + legs[i].getWeight());
    			System.out.println("legs length:" + legs[i].getLength());
    			}
    	
    		
    		
    	for(int j=0;j<hands.length;j++){
    				System.out.println("hands weight:" + hands[j].getWeight());
    				System.out.println("hands length:" + hands[j].getLength());
    	}
    	
    }
	
	public static void main(String[] args) {
		Leg legs[]={new Leg(96,84), new Leg(78,99)};         //สตภýปฏ
		Hand hands[] = {new Hand(63,85),new Hand(68,101)};
		Person name = new Person("xiaoming","female",18,176,legs,hands);
		name.Print();

	}

}

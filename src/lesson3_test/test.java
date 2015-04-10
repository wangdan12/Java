package lesson3_test;



public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = {456,423,396};
		Student s = new Student("xiaoming",3,"networking",scores);
		s.printInfo();
		s.level_up();
		s.printInfo();

	}

}

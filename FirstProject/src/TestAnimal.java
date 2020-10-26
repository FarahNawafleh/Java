
public class TestAnimal {
	public static void main(String[] args) {
		Cat lucy = new Cat();
		lucy.setColor("white");
		lucy.setName("Lucy");
		lucy.setFamily("Shiraz");
		System.out.println(lucy.getName() + " is a " + lucy.getColor() + " " + lucy.getFamily());
		System.out.println(lucy.hasFurr());
		System.out.println("-------------------------------------------");
		Fish nemo = new Fish();

		nemo.setFamily("clownfish");
		System.out.println(nemo.getName() + " is a " + nemo.getColor() + " " + nemo.getFamily());
		System.out.println(nemo.swim());
		System.out.println("-------------------------------------------");

		// Polymorphism
		Animal animal1 = new Fish();
		animal1.setName("Doory");
		animal1.setColor("blue");
		animal1.swim();
		animal1.age();
		System.out.println("-------------------------------------------");

		Animal animal2 = new Cat();
		animal2.setName("Oliver");
		animal2.setColor("gray");
	    animal2.hasFurr();
	    animal2.age();
	    
	    /*
	     *	    Animal animal3 = new Animal();
 
	     * 
	     * */

	}

}

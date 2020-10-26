
public class Cat extends Animal {
	private String family;
public Cat () {
	System.out.println("This is cat class");
}
	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
	public boolean hasFurr ()
	{
		System.out.println("Most cats have furr");
return 	true;	
	}
	
	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("Average cat age is 2-16 years");
		
	}
	
}

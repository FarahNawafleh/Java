
public class Fish extends Animal {
	private String family;
	public Fish () {
		super("nemo", "orange");
		System.out.println("This is Fish class");
	}
		public String getFamily() {
			return family;
		}

		public void setFamily(String family) {
			this.family = family;
		}
public boolean swim ()
{
	System.out.println("Every fish can swim");
	return true;
	}
@Override
public void age() {
	// TODO Auto-generated method stub
	System.out.println("Average clownfish age is 3-5 years");

	
}
}

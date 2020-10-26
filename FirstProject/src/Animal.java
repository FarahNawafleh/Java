
public abstract class Animal {
protected String name;
protected String color; 

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public Animal () {
	System.out.println("This is Animal");
}
public Animal(String name, String color) {
	super();
	this.name = name;
	this.color = color;
	System.out.println(name+" is "+color);
}
public boolean swim ()
{
	System.out.println("Every fish can swim, animal class");
	return true;
	}
public boolean hasFurr() {
	System.out.println("Most cats have furr, animal class");
return 	true;
}
public abstract void age();

/*
 * public abstract void weight();
 * Must implement in other classes 
 * 
*/
}

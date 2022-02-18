package lab.oodp.ood.animals;

/**
 * Represents a dog.
 *
 * TODO Make this class implement the IAnimal interface, then implement all its
 * methods.
 */
public class Dog implements IAnimal {

	private String name;
	private int leg;

	public Dog(String name) {
		this.name = name + " the dog";
		this.leg = 4;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return name + " says woof woof";
	}

	@Override
	public boolean isMammal() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String myName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int legCount() {
		// TODO Auto-generated method stub
		return leg;
	}

}

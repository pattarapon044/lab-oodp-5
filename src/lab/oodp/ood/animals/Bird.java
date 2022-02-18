package lab.oodp.ood.animals;

/**
 * Represents a Bird.
 *
 * TODO Correctly implement these methods, as instructed in the lab handout.
 */
public class Bird implements IAnimal {
	
	private String name;
	private int leg;
	
	public Bird(String name) {
		this.name = name + " the bird";
		this.leg = 2;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return name + " says tweet tweet";
	}

	@Override
	public boolean isMammal() {
		// TODO Auto-generated method stub
		return false;
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

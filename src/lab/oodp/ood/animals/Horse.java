package lab.oodp.ood.animals;

/**
 * Represents a horse.
 *
 * TODO Make this implement IAnimal and IFamous, and provide appropriate implementations of those methods.
 */
public class Horse implements IAnimal, IFamous {
	
	private String name;
	private int leg;
	
	public Horse(String name) {
		this.name = name + " the horse";
		this.leg = 4;
	}

	@Override
	public String famous() {
		// TODO Auto-generated method stub
		return "PharLap";
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return name + " says neigh";
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

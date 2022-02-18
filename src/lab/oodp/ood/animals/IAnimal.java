package lab.oodp.ood.animals;

/**
 * An interface intended to be implemented by animals, who have legs, a name,
 * may or may not be mammals, and can say hello.
 */
public interface IAnimal {

    /**
     * Returns a string containing the greeting
     */
    public String sayHello();

    /**
     * Returns true or false
     */
    public boolean isMammal();

    /**
     * Returns the name, followed by â€?theâ€? followed by the animal type, e.g. â€?George the Monkeyâ€?
     */
    public String myName();

    /**
     * Returns the number of legs
     */
    public int legCount();

}

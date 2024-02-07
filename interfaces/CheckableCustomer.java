// CheckableCustomer class extending Customer class and implementing Checkable interface
public class CheckableCustomer extends Customer implements Checkable {
    // Constructor for CheckableCustomer class

    public CheckableCustomer(String IdIn, String nameIn, double limitIn) {
        // Calling the constructor of the superclass (Customer) with provided parameters
        super(IdIn, nameIn, limitIn);

    }

    // Implementation of the check method from the Checkable interface
    @Override
    public boolean check() {
        // Check if the first character of the customer ID is a letter and the length is 4
        return Character.isLetter(getCustomerId().charAt(0)) && getCustomerId().length() == 4;
    }
}

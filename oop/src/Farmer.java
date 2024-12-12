public class Farmer extends User {
    private Pig[] pigs;

    public Farmer(String name, String contactInfo, String location, Pig[] pigs) {
        super(name, contactInfo, location);
        this.pigs = pigs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Farmer Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Location: " + getLocation());
        System.out.println("Pigs for Sale:");
        for (Pig pig : pigs) {
            System.out.println(pig);
        }
    }
}

public class Buyer extends User {
    public Buyer(String name, String contactInfo, String location) {
        super(name, contactInfo, location);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buyer Name: " + getName());
        System.out.println("Contact Info: " + getContactInfo());
        System.out.println("Location: " + getLocation());
    }
}

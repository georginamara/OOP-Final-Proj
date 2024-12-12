public abstract class User {
    private String name;
    private String contactInfo;
    private String location;

    public User(String name, String contactInfo, String location) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getLocation() {
        return location;
    }

    public abstract void displayInfo();
}

public class Pig {
    private String id;
    private String breed;
    private double price;

    public Pig(String id, String breed, double price) {
        this.id = id;
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Breed: " + breed + ", Price: " + price;
    }
}

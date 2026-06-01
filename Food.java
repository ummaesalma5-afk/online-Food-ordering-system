public class Food {
    private int id;
    private String name;
    private int price;

    public Food(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println(id + ". " + name + " - Rs." + price);
    }

    @Override
    public String toString() {
        return id + ". " + name + " - Rs." + price;
    }
}

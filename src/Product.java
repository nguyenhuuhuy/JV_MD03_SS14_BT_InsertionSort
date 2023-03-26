public class Product {
    private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    private String name;
    private double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}'+"\n";
    }

    public Product(int index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

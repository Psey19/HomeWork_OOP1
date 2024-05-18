public abstract class Product {
    private String name;
    private int cost;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product: " +
                "name - '" + name + '\'' +
                ", cost(Rub) - " + cost;
    }
}

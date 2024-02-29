public class Product {
    private int id;

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

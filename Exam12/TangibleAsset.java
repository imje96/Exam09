package dayEighth;

public abstract class TangibleAsset extends Asset implements Thing {
    private String name;
    private int price;
    private String function;

    TangibleAsset(String name, int price, String function) {
        this.name = name;
        this.price = price;
        this.function = function;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return function;
    }

}

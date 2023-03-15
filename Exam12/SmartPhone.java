package dayEighth;
    
public class SmartPhone extends TangibleAsset {
    private String brand;
    
    public SmartPhone(String name, int price, String function, String brand) {
        super(name, price, function);
        this.brand = brand;
}

    public String getbrand() {
    return brand;
}

// 생성 확인
//public static void main(String[] args) {
//    SmartPhone smartphone = new SmartPhone("iphone", 120, "touchscreen", "apple");
//    System.out.println(SmartPhone.getPrice());
//    System.out.println(SmartPhone.getFunction());
//    System.out.println(SmartPhone.getBrand());
//    }

}


package Exam_12;

public class Computer extends TangibleAsset {
    private String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return makerName;
    }

    // 생성 확인
//    public static void main(String[] args) {
//        Computer computer = new Computer("Mac", 900, "white", "Samsung");
//        System.out.println(computer.getColor());
//        System.out.println(computer.getMakerName());
//        System.out.println(computer.getWeight());
//    }

}
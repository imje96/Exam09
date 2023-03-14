package game;

public class Main {
    public static void main(String[] args) {
//        NewCleric nc = new NewCleric("아서스", 40, 5);
//        NewCleric nc2 = new NewCleric("지은", 40, 5);
        
        NewCleric nc = new NewCleric("아서스");
        System.out.println(nc.name);
        System.out.println(nc.hp);
        System.out.println(nc.mp);
        
        NewCleric nc1 = new NewCleric("아서스", 20);
        System.out.println(nc1.name);
        System.out.println(nc1.hp);
        System.out.println(nc1.mp);
        
        NewCleric nc2 = new NewCleric("아서스", 20, 5);
        System.out.println(nc2.name);
        System.out.println(nc2.hp);
        System.out.println(nc2.mp);
        
    }
}

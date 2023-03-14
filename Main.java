package game;

    
public class Main {
    int num = 10;
    public static void soulution() {}
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.num);
        
        Main.soulution();
        
        System.out.println(Hero.money);
        
        Hero superman = new hero("슈퍼맨", 100);

        Hero batman = new hero("배트맨", 100);
        
        //superMan.money = 100;  // 사실 안좋은 방법\
        Hero.money = 100; // static이 나올 때
        Hero.money = 50; // static이 나올 때
        // batMan.money = 50;
    }
//        Sword sword = new Sword(); // 칼 장착 
//        sword.name = "불의 검";         
//        sword.damage = 10;    
//        
//        Hero hero = new Hero("슈퍼맨", 180); // 같은 패키지라 import 없어도 됨 
//        // 속성 조정(값 넣기)
//        String str = "asdf"; // p.10 최적화, 성능이 좋음 
//        //String str = new String("asdf"); // 효율이 나쁨
//        
//        
//        hero.name = "슈퍼맨";
//        hero.hp = 100;
////        System.out.println(hero.name + " : " + hero.hp);
//            
//        Kinoko kinoko1 = new Kinoko();
//        kinoko1.hp = 50;
//        kinoko1.suffix = 'A';
//
//        Kinoko kinoko2 = new Kinoko();
//        kinoko1.hp = 48;
//        kinoko1.suffix = 'B';
//        
//        // 모험의 시작
//        hero.sit(5); 
//        hero.slip();
//        hero.sit(25);
//        hero.run();        
//        
        
        
        
        
        
        
        
//    }
//
//}

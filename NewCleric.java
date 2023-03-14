package game;
import java.util.Random;

public class NewCleric {
    String name;
    // 연습문제 9-1.최대 HP, 최대 MP의 필드가 각 인스턴스별로 있지 않도록, 필드 선언에 적절한 키워드를 추가 하시오.
    static final int HP_MAX = 50; 
    static final int MP_MAX = 10;
    int hp = HP_MAX; 
    int mp = MP_MAX;

    Random rand = new Random();
    // 연습문제 9-2. 이 클래스는 new Cleric(“아서스", 40, 5) 와 같이, 이름, HP, MP 를 지정하여 인스턴스화 할 수 있다
    NewCleric(String name, int hp, int mp){
         this.name = name;   
         this.hp = hp;
         this.mp = mp; 
    } 
     // 연습문제 9-2. 이 클래스는 new Cleric(“아서스", 35) 와 같이, 이름과 HP만으로 지정하여 인스턴스화 할 수 있다. 이 때, MP는 최대 MP와 같은 값이 초기화 된다
    NewCleric(String name, int hp) {
        this(name, hp, MP_MAX);
   }
    // 연습문제 9-2. 이 클래스는 new Cleric(“아서스") 와 같이 이름만을 지정하여 인스턴스화 할 수 있다. 이 때, HP 와 MP 는 최대 HP와 최대 MP로 초기화 된다
    NewCleric(String name) {
        this(name, HP_MAX, MP_MAX);   
   }
    
//    NewCleric() {
//        
//    }

}

//NewCleric(String name, int hp, int mp){
//    this.name =name;   
//    this.hp = 40;
//    this.mp = 5; 
//} 
//
//NewCleric(String name, int hp) {
//   this(name, hp, 123);
//}   그냥 this(name, hp); 일때는 자기 자신을 호출하는 것, 
//    바로 위에 있는 NewCleric을 호출함 
//
//NewCleric(String name) {
//   this(name, 30);   
//}



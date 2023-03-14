package game;
import java.util.Random;

public class NewCleric {
    String name;
    static final int HP_MAX = 50; 
    static final int MP_MAX = 10;
    int hp = HP_MAX; 
    int mp = MP_MAX;
    // 기본적으로 갖고있는 속성(필드값)
    // maxHP와 HP를 같이 수정할 수 있음 
    Random rand = new Random();
    // Random을 Cleric에 빼는 것이 더 좋음
    NewCleric(String name, int hp, int mp){
         this.name = name;   
         this.hp = hp;
         this.mp = mp; 
    } 
    
    NewCleric(String name, int hp) {
        this(name, hp, MP_MAX);
   }
    
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



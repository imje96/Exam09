package game;

import java.util.Random;

public class Cleric2 {
    String name = "김용사";
    final int HP_MAX = 50; 
    final int MP_MAX = 10;
    int hp = HP_MAX; 
    int mp = MP_MAX;
    // 기본적으로 갖고있는 속성(필드값)
    // maxHP와 HP를 같이 수정할 수 있음 
    Random rand = new Random();
    // Random을 Cleric에 빼는 것이 더 좋음
    
    void selfAid() { // 리턴 값 없음
        if (hp < HP_MAX) {
            this.mp -= 5; // mp 5소비
            this.hp = HP_MAX; // 최대 HP 회복
        }
    }
//    0~2 포인트 보정 
    public int pray(int sec) {
            
        int recoveryMP = sec + rand.nextInt(3);
        
        mp = Math.min(mp, MP_MAX);
        // 이거 쓰면 if문 안 써도 됨 // 삼항연산..? 
        
        return recoveryMP;
        
        //mp += recoveryMP;
        
//        if (mp > MP_MAX) {
//            mp = MP_MAX;
//        }
        
    }
}


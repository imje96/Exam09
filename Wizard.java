package game;

public class Wizard {
    String name;
    int hp;
    
    void heal(Hero hero) {
        hero.hp += 10;  // 히어로의 hp를 10 올린다, 위자드는 히어로만 치료

    }
}

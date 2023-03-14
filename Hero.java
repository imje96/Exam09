package game;

public class Hero {
    String name;
    int hp;
    
    Sword sword; // 칼을 차는 것
    
    static int money;
    
    // 기본 생성자 primary constructor
    Hero(String name, int hp) {  //String name을 위에 string name을 쓰고 싶은데 중복, 따라서 this 를 사용(필드를 가리킴)
        this.name = name;   
        this.hp = 100;
//        sword = new Sword(); // 게임에서 칼이 없는 용사도 있어서 기본에 x 
                
    } // new를 했을 때 기본적으로 동작해야 되는 것 
    
    Hero(int hp){
        this.name = "noname";
        this.hp = 100;
    }
    //오버로드
    static void setRandomMoney() {
        Hero.money = (int) (Math.random() * 1000);
    }
    
    
    void attack() {}
    void run() {
        System.out.println(this.name + "는 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + " 입니다");
    }
    void sit(int sec) {
        this.hp += sec; // 앉은 초 수만큼 HP가 증가
        System.out.println(this.name + "는 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }
    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "는 넘어졌다!");
        System.out.println("5의 데미지!");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "는 잠을 자고 회복했다!");
    }
}
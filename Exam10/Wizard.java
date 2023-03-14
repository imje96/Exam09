package game;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHP() {
        return hp;
    }
    // 5. HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다
    public void setHP(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    
    public int getMP() {
        return mp;
    }
    // 4. 마법사의 MP는 0이상이어야 한다
    public void setMP(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0이상이어야 한다");
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }
    // 1. 마법사의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        this.name = name;
    }

    public Wand getWand() {
        return wand;
    }
    // 3. 마법사의 지팡이는 null 일 수 없다
    public void setWand(Wand wand) {
        this.wand = wand;
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null일 수 없다");
    }
    }
    void heal(Hero hero) {
        hero.hp += 10;  // 히어로의 hp를 10 올린다, 위자드는 히어로만 치료
    }
    
        
    }
    // getter/setter 실행 확인
    // public static void main(String[] args) {
    // Wizard wizard = new Wizard();
    // wizard.setHP(100);
    // wizard.setMP(50);
    // wizard.setName("Gandalf");
    // Wand wand = new Wand();
    // wand.setPower(100);
    // wand.setName("The Elder Wand");
    // wizard.setWand(wand);
    //
    // System.out.println(wizard.getHP());
    // System.out.println(wizard.getMP());
    // System.out.println(wizard.getName());
    // }




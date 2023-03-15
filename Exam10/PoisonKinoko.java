package game;

public class PoisonKinoko extends Kinoko {
    private int remainingAttack; // 생성자에서 초기화 remaningAttack

    public PoisonKinoko(char suffix) {
        super(suffix);
        remainingAttack = 5;
    }
    // PoisonKinoko poisonKinoko = new PoisonKinoko('A');

    @Override // 주석. 아무 의미 없음
    void attack(Hero hero) {
        super.attack(hero);

        if (remainingAttack > 0) { 
            // remainingAttack != 0 음수로 가면 실행되기 때문에 >0 이 안전함

            System.out.println("추가로, 독 포자를 살포했다!");
            int posionDamage = (int) (hero.getHp() * 0.2);
            hero.setHp(hero.getHp() - posionDamage);
            System.out.println(posionDamage + "의 데미지");
            remainingAttack--;
        }
    }
}


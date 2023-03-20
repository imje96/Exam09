package Exam4_UP;

enum KeyType {
	PADLOCK(1024), // enum 값 PADLOCK은 maxUses = 1024를 가진다
	BUTTON(10000), // enum 값 BUTTON은 maxUses = 10000를 가진다
	DIAL(30000), // enum 값 DIAL은 maxUses = 30000를 가진다
	FINGER(1000000); // enum 값 FINGER는 maxUses = 1000000를 가진다

	private final int maxUses;

	private KeyType(int maxUses) { // KeyType 생성자
		this.maxUses = maxUses; // 입력받은 maxUses를 멤버 변수 maxUses에 할당한다
	}

	public int getMaxUses() { // maxUses를 반환하는 메소드
        return maxUses;
    }
}

public class StrongBox<E> {
	private E data;
	private KeyType keyType;
	private int uses;

	public StrongBox(KeyType keys) {
		this.keyType = keys;
		this.uses = uses;
	}

	public void put(E data) {
		this.data = data;
	}

	public E get() {
		if (uses < keyType.getMaxUses()) {
			uses++;
			return data;
		} else {
			return null;
		}
	}

}

// 연습문제 4-1에서 작성한 StrongBox 클래스에 열쇠의 종류를 나타내는 열거형 KeyType을 정의하고,다음 내용을 반영하여 StrongBox 클래스를 수정하시오.
//
//- 열쇠의 종류를 나타내는 필드 변수
//- 열쇠의 종류를 받는 생성자
//
//단, 열쇠의 종류는 다음 4종류로 한정한다. 각 열쇠는 사용횟수의 한도가 정해져 있다.
//
//1. PADLOCK (1,024회)
//2. BUTTON (10,000회)
//3. DIAL (30,000회)
//4. FINGER (1,000,000회)
//
//금고에서 get() 메서드를 호출할 때 마다 사용횟수를 카운트하고 각 열쇠의 사용횟수에 도달하기 전에는 null을 리턴한다.

//
//1. 금고 클래스에 담는 인스턴스의 타입은 미정
//2. 금고에는 1개의 인스턴스를 담을 수 있음
//3. put() 메서드로 인스턴스를 저장하고 get() 메서드로 인스턴스를 얻을 있음
//4. get() 으로 얻을 때는 별도의 타입 캐스팅을 사용하지 않아도 됨
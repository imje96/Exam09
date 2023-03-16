package Polymorphism;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
 
        Y y1 = new A();
        Y y2 = new B();
        
        Y[] arr = new Y[2];
        arr[0] = new A();
        arr[1] = new B();     
       
        for(Y data:arr) {
            data.b();
        }
//        for(int i = 0; i < arr.length; i++) {
//            arr[i].b();
//        }
        }

    }

//문제 13-2 에서 이용한 A클래스나 B클래스의 인스턴스를 각각 1개씩 생성하여, 요소의 수가 2개인 1차원 배열에 차례로 담는다.
//그 후에 배열의 요소를 루프로 차례대로 꺼내 각각의 인스턴스의 b() 메소드를 호출 하여야 한다. 이상을 전제로 다음 물음에 답하시오.
//배열변수의 타입으로 무엇을 사용하여야 하는가
//위에서 설명하고 있는 프로그램을 작성하시오

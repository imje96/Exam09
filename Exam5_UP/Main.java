package Exam5_UP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Main {
    interface MyFunction{
        int call(int a, int b);
    } 
    
public static int add(int x, int y) {
    return x + y;
}

public static int deohagi(int x, int y) {
    return x + y;
}

c

public static void Func(String[] args) {
    IntBinaryOperator addFunction = Main::add;
    MyFunction deohagiFunction = Main::add;
    MyFunction deohagiFunction2 = Main::deohagi;
    // lambda expression
    MyFunction addFunction2 = (int a, int b) -> {
        return a + b;
    };
    MyFunction gophagi = (int a, int b) -> {
        return a * b;
    };
}
public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    
    for (int i = 0; i < nums.size(); i++) {
        if (nums.get(i) % 2 == 0) {
            System.out.println(nums.get(i) + 1);      // 짝수에 +1
        }
    }
    System.out.println("===");
    
    nums.stream()
        .filter((Integer num) -> num % 2 == 0)    // 거르기  2, 4, 6
        .map((num) -> num + "번") // 변환 "2번", "4번", "6번" List<String>
        .forEach((num) -> System.out.println(num + 1)); // 무지성 뺑뺑이
    
    List<Integer> names = new ArrayList<>();
    names.add("박경덕");
    names.add("박준하");
    names.add("이동학");
    names.add("박태현");
    
    List<String> parks = getParkList(names);
}

// 기존방법
    public static List<String> getParkList(List<String> names) {
        List<String> results = new ArrayList<>();
        
        for (String name: names) {
            if (name.startsWith("박")) {
                results.add(name);
            }
        }
    }
 // 람다식
    public static List<String> getParkList(List<String> names) {
        names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
        // 의미부여 안하려면 name대신 e로 해도 됨
    }
}

//    int result = addFunction.applyAsInt(10, 5);
//    System.out.println(result);
//    
//    result = deohagiFunction.call(10,20);



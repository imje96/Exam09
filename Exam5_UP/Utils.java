package Exam5_UP;

interface Func1 {
    public abstract boolean checkOdd(int a);
}


interface Func2 {
    public abstract String addName(boolean male, String name);
}


public class Utils {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static String addNamePrefix(boolean male, String name) {
        if (male == true) {
            return "Mr." + name;
        }
        return "Ms." + name;
    }

    public static void main(String[] args) {
        // Func1 람다식
        Func1 func1 = n -> n % 2 == 1;
        boolean result1 = func1.checkOdd(1);
        System.out.println(result1);
        
        // Func2 람다식
        Func2 func2 = (male, name) -> male == true ? "Mr." + name : "Ms." + name;
        String result2 = func2.addName(true, "이호창");
        System.out.println(result2);

    }
}

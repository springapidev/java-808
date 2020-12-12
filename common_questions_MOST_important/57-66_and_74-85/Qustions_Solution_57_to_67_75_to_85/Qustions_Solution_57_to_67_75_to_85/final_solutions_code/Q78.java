package final_solutions;

import java.util.function.Predicate;

public class Q78 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n%2 == 0;

        Boolean s = p.test(100);
        System.out.println(s);
    }
}

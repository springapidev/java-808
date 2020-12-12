package final_solutions;

public class Q82 {
    public static void main(String[] args) {
        int x = 6;
        while (isAvailable(x)){
            System.out.println(--x);
        }
    }

    public static boolean isAvailable(int x){
//        return --x > 0 ? true: false;
        return --x > 0 ? true: false;
    }
}

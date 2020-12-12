package final_solutions;

public class Q81 {
    int count; // Non static variable
    public static void displayMsg(){
//        System.out.println("Welcome Visit Count: " + count++); // Compilation fails
    }
    public static void main(String[] args) {
       Q81.displayMsg();
       displayMsg();

    }
}

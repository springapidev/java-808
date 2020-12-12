package final_solutions;

public class Q74 {
    String myStr = "9009";
    public void doStuff(String str){
        int myNum = 0;
        try {
        String myStr = str;
        myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException ne) {
            System.out.println("Error");
        }
        System.out.println(
                "myStr: "+ myStr + ", myNum: "+ myNum
        );
    }

    public static void main(String[] args) {
        Q74 obj = new Q74();
        obj.doStuff("7007");
    }
}

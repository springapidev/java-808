package final_solutions;

public class Q63 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");

        // line n1
//        if(str2.equals(str1.toLowerCase())) // prints Not Equal
//        if(str1.toLowerCase() == str2.toLowerCase()) // prints Not Equal
        str1.toLowerCase();
//        if(str1 == str2) // prints Not Equal
        str1.toLowerCase();
        if (str1.equals(str2)) // prints Not Equal
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

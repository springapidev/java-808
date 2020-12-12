package final_solutions;

public class Q61 {
}

abstract class Toy {
    int price;

    // line n1
    /*A*/
    public int calculatePrice() {
        return price;
    } // valid

    /*B*/
//    public static insertToy(){} // invalid

    /*C*/
    final int getToy(){ // valid
        return 100;
    }

    /*D*/
    public abstract int computeDiscount(); // valid


    /*E*/
//    public void printToy(); // invalid
}

package final_solutions;

public class Q60 {
}

class StockRoom {
    private int stock = 10;
    private int qty;

    public void purchase(int q) {
        stock += q;
        this.qty = q;
    }

    public void sell(int q) {
        stock -= q;
        this.qty = q;
    }

    public void printStock(String action) {
        System.out.println(action + ":" + qty +" items Stock in Hand: " + stock);
    }

    public static void main(String[] args) {
        StockRoom k1 = new StockRoom();
        k1.sell(5);
//        StockRoom.printStock("Sold"); // compilation error
        StockRoom k2 = new StockRoom();
        k2.purchase(5);
//        StockRoom.printStock("Purchased"); // compilation error
    }
}

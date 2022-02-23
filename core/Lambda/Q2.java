import java.util.ArrayList;



public class Q2 {
    
    public Q2(int totalPrice, String status) {
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private int totalPrice;
    private String status;

    public static ArrayList<Q2> listOfOrders(ArrayList<Q2> orders) {
        ArrayList<Q2> listOrders = new ArrayList<>();


        for(Q2 order:orders){
            if((order.getStatus().equals("ACCEPTED") || order.getStatus().equals("COMPLETED"))&& order.getTotalPrice()>1000){
                System.out.println("Inside if");
                Q2 or = new Q2(order.getTotalPrice(),order.getStatus());
                listOrders.add(or);
            }
        }

        return listOrders;
    }
    public static void main(String[] args) {
        Q2 a1 = new Q2(10001,"ACCEPTED");
        Q2 a2 = new Q2(1000,"ACCEPTED");
        Q2 a3 = new Q2(10500,"COMPLETED");
        Q2 a4 = new Q2(100,"ACCEPTED");
        Q2 a5 = new Q2(10002,"ACCEPTED");
        Q2 a6 = new Q2(10005,"REJECTED");
        Q2 a7 = new Q2(50000,"COMPLETED");

        ArrayList<Q2> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);
        list.add(a7);
        System.out.println(list);
        System.out.println(listOfOrders(list));



    }
}

package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.Scanner;
public class Q5 {
    static String p = "src/file1.txt";
    static String q = "src/file2.txt";
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int i = 1;
        while (i>0){
            System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
            int option = sc.nextInt();
            if(option == 1){
                    addPrice(i);
                    i++;
                    int o2 = 1;
                    while (o2>0){
                        System.out.println("Do you want to enter price for more items? (Yes/No)");
                        String option2 = sc.next();
                        if (Objects.equals(option2, "Yes")) {addPrice(i);i++;}
                        else if (Objects.equals(option2, "No")) {o2=0;}
                        else { System.out.println("Invalid Option"); o2=0;}
                    }
                }
                else if(option == 2) {
                totalPrice();}
                else if(option == 3){i =0;}
            }
        }

    public static void totalPrice() throws IOException {
        System.out.println("Total Price of all items is : " +Files.readString(Path.of(q)));
    }
    public static void addPrice(int i) throws IOException {
        System.out.println("Insert"+i +"price");
        int price = sc.nextInt();
        String Tp = Files.readString(Path.of(q));
        int Tpe = Integer.parseInt(Tp)+price;
        Files.writeString(Path.of(p),String.valueOf(price),StandardOpenOption.APPEND);
        Files.writeString(Path.of(q),String.valueOf(Tpe),StandardOpenOption.WRITE);
        System.out.println("Price has been saved to the file");
    }
}
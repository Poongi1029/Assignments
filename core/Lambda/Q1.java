
import java.util.function.BiFunction;

public class Q1 {
 
    public static void main(String[] args) {
        BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;
        BiFunction <Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;
        BiFunction <Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;
        BiFunction <Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;
        BiFunction <Integer, Integer, Integer> funcModuloObj = (i1, i2) -> i1 % i2;
        System.out.println("Addition of 13 and 5: " + funcAddObj.apply(13, 5));
        System.out.println("Subtract of 13 and 5: " + funcSubtractObj.apply(13, 5));
        System.out.println("Multiply of 13 and 5: " + funcMuliplyObj.apply(13, 5));
        System.out.println("Division of 13 and 5: " + funcDivideObj.apply(13, 5));
        System.out.println("Modulo of 13 and 5: " + funcModuloObj.apply(13, 5));
 
    }
 
}
 
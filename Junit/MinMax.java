package testing;

import java.util.Arrays;
public class MinMax {
    public static int[] findMinMax(int[] arr) {
        int[] as = new int[2];
        as[0] = (Arrays.stream(arr).min().getAsInt());
        as[1] = (Arrays.stream(arr).max().getAsInt());
        return as;
    }
  

    public static String findMinMax2(int[] arr) {
        int min = (Arrays.stream(arr).min().getAsInt());
        int max = (Arrays.stream(arr).max().getAsInt());
        return "Min is "+ min+" Max is "+max;
    }
}

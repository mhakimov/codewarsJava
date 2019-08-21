import java.util.*;

public class Kyu8 {

    public int Liters(double time)  {

        return (int) Math.floor(time * 0.5);

    }

    public static int[] map(int[] arr) {
        int[] arrToReturn = new int[arr.length];
        for(int i = 0; i < arrToReturn.length; i++) {
            arrToReturn[i] = arr[i]*2;
        }
        return arrToReturn;
    }

    public static int[] map2(int[] arr) {
        return Arrays.stream(arr).map(i -> i*2).toArray();
    }

    public static int getAverage(int[] marks){
        return (int) Math.floor(Arrays.stream(marks).average().getAsDouble());
    }

    public static int getAverage2(int[] marks){
        return Arrays.stream(marks).sum()/marks.length;
    }
}


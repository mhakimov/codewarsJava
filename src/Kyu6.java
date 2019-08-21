public class Kyu6 {

    public static int TripleDouble(long num1, long num2)
    {
        for (short i = 0; i < 10; i++) {
            String triple = Short.toString(i) + Short.toString(i) + Short.toString(i);

            if (Long.toString(num1).contains(triple)) {

                String doubl = triple.substring(1);
                if (Long.toString(num2).contains(doubl))
                    return 1;
            }
        }
        return 0;
    }
}

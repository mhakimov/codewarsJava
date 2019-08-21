import java.util.ArrayList;
import java.util.List;

public class Kyu7 {

    public static boolean containAllRots(String strng, List<String> arr) {

        List<String> ls = new ArrayList<String>();
        for (int i = 0; i < strng.length(); i++) {

            ls.add(strng);
            strng = strng.substring(1) + strng.substring(0,1);
        }

        for (String str : ls) {
            if(!arr.contains(str))
                return false;
        }

        return true;
    }
}

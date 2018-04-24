/**
 * Created by anurag on 23-Apr-18.
 */
public class TestManager {

    public static void main(String ... args)
    {
        System.out.println("I am ok!");
    }

    public static String reverse(String word)
    {
        String[] arr = word.split(" ");
        String result="";
        for (String w :arr)
        {
             result = w +" "+result;
        }
        System.out.println(result);
        return result;

    }
}

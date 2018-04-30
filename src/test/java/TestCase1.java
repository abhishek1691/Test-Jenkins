import org.junit.Test;

/**
 * Created by anurag on 23-Apr-18.
 */
public class TestCase1 {
    @Test
    public boolean start()
    {
       String result= TestManager.reverse("This is my first program");
       return isValid(result);
    }

    private boolean isValid(String result) {
        if (result.equals("program first my is This "))
            return true;
        else return false;
    }
}

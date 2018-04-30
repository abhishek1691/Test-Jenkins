public class CommanRunner {

    public static void main(String[] args)
    {

        TestCase1 testCase1 = new TestCase1();
        if (testCase1.start())
        {
            System.out.print("Test case is passed");
        }
        else  System.out.print("Test case is faild");


    }
}

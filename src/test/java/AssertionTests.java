import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class AssertionTests {
    int a,b;
    @Parameters({"a","b"})
    @Test()
        public void assertTests(int a, int b){
            System.out.println("Your entered values are: "+a+" "+b);
            int sum=a+b;
            System.out.println("The sum between the values is: "+sum);
           // assertEquals(sum,12,"Assertion message comes here");

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(a<b);
        softAssert.assertTrue(b>a);
        softAssert.assertTrue(sum<10);
        softAssert.assertAll();
        }


}

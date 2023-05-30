import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestsWithParameters {
    @Parameters({"parameter-name"})
    @Test
    public void testWithParameters(String name){
        System.out.println("This test is taking the following parameter: "+ name);

    }
}

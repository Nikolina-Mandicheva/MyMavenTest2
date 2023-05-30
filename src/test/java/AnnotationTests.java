import org.testng.annotations.*;

public class AnnotationTests {
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("This is before test update!");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("This is after test update!");
    }
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("This is before method update!");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("This is after method update!");
    }

    public void myRegularMethod(){
        System.out.println("This is regular method execution");
    }
    @Test
    public void myFirstTestNGTestCase() {
        System.out.println("This is my First testNG test case");
        myRegularMethod();
    }
    @Test (priority=-1)
    public void mySecondTestNGTestCase() {
        System.out.println("This is my SECond testNG test case (but should be printed as FIRST)");
         }



}

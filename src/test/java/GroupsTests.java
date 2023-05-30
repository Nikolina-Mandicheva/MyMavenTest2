import org.testng.annotations.Test;

public class GroupsTests {
    @Test(groups = "myGroup")
    public void groupExample() {
        System.out.println("This is a group test - initial one");
    }
    @Test(dependsOnGroups = "myGroup")
    public void dependsOnGroups() {
        System.out.println("This test depends on myGroup");
    }

    //  @Test(groups = "example3", description = "Desc", testName = "Priority test executed last", priority = 1)
    // public void priorityLastExample() {
    //     System.out.println("This is a priority test");
    // }

}

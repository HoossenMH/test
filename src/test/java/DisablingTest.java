import org.junit.*;

/**
 * Created by student on 2016/03/06.
 */
public class DisablingTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }
    //execute after class
    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }
    //execute before test
    @Before
    public void before() {
        System.out.println("in before");
    }
    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }
    @Test
    public void test() { System.out.println("in test"); }


    @Test
    void testDisable(){
        Assert.fail("This test is disabled");
    }
}

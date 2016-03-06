import org.junit.*;

/**
 * Created by student on 2016/03/06.
 */
public class ObjectEqualityTest {
    private Student s1;
    private Student s2;

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
    public void test() {

        s1 = new Student("213223538", "Hasan", "Hoossen", true);
        s2 = s1;

        Assert.assertEquals(s1,s2);
    }
}

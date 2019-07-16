import com.kodilla.patterns.singleton.Logger;
import org.junit.*;

public class LoggerTestSuite {

    @BeforeClass
    public static void start() {
        System.out.println("Starting Test...");

    }

    @AfterClass
    public  static  void end(){
        System.out.println("Ending Test...");
    }
    @Before
    public void beforeTest(){
        System.out.println("before test...");
    }
    @After
    public void afterTest(){
        System.out.println("after test...");
    }

    @Test
    public void getLastLogTst(){
        Logger.getInstance().log("my first Log");

        Assert.assertEquals("my first Log",Logger.getInstance().getLastLog());


    }
}

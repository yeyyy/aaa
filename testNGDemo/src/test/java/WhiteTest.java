import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/5/2.
 */
public class WhiteTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testWhiteTest() throws Exception {
        Assert.assertEquals(White.whiteTest(0,1),0);

    }
    @Test
    public void testWhiteTest1() throws Exception {
        Assert.assertEquals(White.whiteTest(1,0),101);

    }
    @Test
    public void testWhiteTest2() throws Exception {
        Assert.assertEquals(White.whiteTest(2,2),40);

    }
    @Test
    public void testWhiteTest3() throws Exception {
        Assert.assertEquals(White.whiteTest(2, 1), 20);
    }
}
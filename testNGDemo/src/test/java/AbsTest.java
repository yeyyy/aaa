import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/5/2.
 */
public class AbsTest {

    @BeforeMethod
    public void setUp() throws Exception {

    }

    @Test
    public void testAbs() throws Exception {
        Abs ab = new Abs();
//        int expResult = ab.abs(-1);
//        if (expResult==1){
//            System.out.println();
//        }

        Assert.assertEquals(ab.abs(-1),1,"-1的绝对值是1");

    }
    @Test
    public void testAbs1() throws Exception {
        Abs ab = new Abs();
        Assert.assertEquals(ab.abs(0), 0, "0的绝对值是0");
        System.out.println("啦啦啦啦");
    }
    @Test
    public void testAbs2() throws Exception {
        Abs ab = new Abs();
        Assert.assertEquals(ab.abs(-2), 2, "-2的绝对值是2");
        System.out.println("哈哈哈");
    }


}
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/5/2.
 */
//public class TriangleTest {
//
//    Triangle a =new Triangle(1, 2, 2);
//
//    Triangle b =new Triangle(1, 1, 2);
//
//    Triangle c =new Triangle(2, 2, 2);
//
//    Triangle d =new Triangle(2, 3, 4);
//
//    Triangle e = new Triangle(0, 1, 2);
//
//
//
//    long[]s = {1,2,2};
//
//
//
//    @Test
//
//    public void testIsTriangle() {
//
//        Assert.assertEquals(false,b.isTriangle(b));
//
//        Assert.assertEquals(true,a.isTriangle(a));
//
//        Assert.assertEquals(false,e.isTriangle(e));
//
//    }
//
//
//
//    @Test
//
//    public void testGetType() {
//
//        Assert.assertEquals("Illegal",b.getType(b));
//
//        Assert.assertEquals("Isosceles",a.getType(a));
//
//        Assert.assertEquals("Regular",c.getType(c));
//
//        Assert.assertEquals("Scalene",d.getType(d));
//
//    }
//
//
//
//    @Test
//
//    public void testGetBorders() {
//
//        Assert.assertEquals(s,a.getBorders());
//
//    }
//
//}
public class TriangleTest {
    @BeforeMethod
    public void setUp(){
        Triangle triangle = new Triangle(0,0,0);
    }
    @AfterMethod
    public void tearDown(){

    }
    //检测是否为三角形
     //不是三角形
    @Test
    public void testIsTriangle(){
        Triangle triangle = new Triangle(1,1,2);
        Assert.assertEquals(triangle.isTriangle(triangle),false);
    }
    //是三角形
    @Test
    public void testIsTriangle1(){
        Triangle triangle = new Triangle(2,3,4);
        Assert.assertEquals(triangle.isTriangle(triangle),true);
    }
    //检测三角形的种类
    //等腰
    @Test
    public void testGetType(){
        Triangle triangle = new Triangle(3,3,5);
        Assert.assertEquals(triangle.getType(triangle),"Isosceles");
    }
    //非法
    @Test
    public void testGetType1(){
        Triangle triangle = new Triangle(-1,3,5);
        Assert.assertEquals(triangle.getType(triangle),"Illegal");
    }
    //等边
    @Test
    public void testGetType2(){
        Triangle triangle = new Triangle(2,2,2);
        Assert.assertEquals(triangle.getType(triangle),"Regular");
    }
    //不等边
    @Test
    public void testGetType3(){
        Triangle triangle = new Triangle(3,6,7);
        Assert.assertEquals(triangle.getType(triangle),"Scalene");
    }
    //两条边不相等
    @Test
    public void testDiffofBorders(){
        Triangle triangle = new Triangle(3,3,5);
        long dif1 = triangle.diffOfBorders(3,3);
        long diff2 = triangle.diffOfBorders(dif1,5);
        Assert.assertEquals(diff2,5);
    }
    //存储个条边的长度
    @Test
    public void testGetBorders(){
        Triangle triangle = new Triangle(3,4,5);

    }
}


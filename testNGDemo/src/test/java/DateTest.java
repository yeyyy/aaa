import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/4.
 */
public class DateTest {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String data = dateFormat.format(new Date());
        System.out.println(data);
    }
}

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableWorkbook;
import org.apache.log4j.Logger;
import util.LogConfiguration;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2018/5/3.
 */
public class ReadExcelDemo {
    private static WritableWorkbook wb = null;
   private static Logger logger = Logger.getLogger(ReadExcelDemo.class);
    public static String [][] readExcel(String path,String sheetName) {
        InputStream in = null;
        String[][] data = null;
        try {
            in = new FileInputStream(path);
            logger.info("成功获取了输入流");
            Workbook workbook = Workbook.getWorkbook(in);
            Sheet sheet = workbook.getSheet(sheetName);
            logger.info("成功获取了表单");
            int rows = sheet.getRows();
            int columns = sheet.getColumns();
            data = new String[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {

                    data[i][j] = sheet.getCell(j, i).getContents();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;

    }

    public static void main(String[] args) {
        LogConfiguration.initLog();
//        PropertyConfigurator.configure("log4j.properties");
        String[][] myData = readExcel("./data.xls","login");
        System.out.println(".............. ");
//        System.out.println(myData[0][0]+"\t");
//        System.out.println(myData[0][1]);
//        System.out.println(myData[1][0]+"\t");
//        System.out.println(myData[1][1]);
//        PropertyConfigurator.configure();
        for (int i=0;i<myData.length;i++){
            String[] item = myData[i];
            for (int j=0;j<myData.length;j++){
                System.out.println(item[j]+"\t");
            }
            System.out.println();
        }


    }
}

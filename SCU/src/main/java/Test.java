import org.dcm4che3.tool.storescu.StoreSCU;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        List<String> arrays = new ArrayList<String>();

        arrays.add("--uid-suffix"); //line 1
        Random rdm = new Random();
        //int id = rdm.nextInt(999999);
        int id = 22446688;
        arrays.add("_SCU_"+ id); //line 2
/*        arrays.add("--user");
        arrays.add("cuong");
        arrays.add("--user-pass");13.125.66.10
        arrays.add("123456");*/
        arrays.add("-c"); //line 3
        arrays.add("STORESCP@localhost:4440"); //line 4
        arrays.add("D:\\cuongTestSCU\\"); //line 5

        String[] abc = arrays.toArray(new String[arrays.size()]);
        StoreSCU.main(abc);
    }
}
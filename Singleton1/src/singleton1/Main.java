
package singleton1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main {
//xay dung quan li ban hang
    //danh muc san pham:id,catName
    //san pham:id, title,price,idCat
    //1 doi tuong DataMgr quan li danh muc san pham va san pham
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataMgr datamgr1 = DataMgr.getInstance();
        DataMgr datamgr2 = DataMgr.getInstance();
        DataMgr datamgr3 = DataMgr.getInstance();
        DataMgr datamgr4 = DataMgr.getInstance();
        DataMgr datamgr5 = DataMgr.getInstance();
        // xử lí thêm các chức năng, danh mục sản phẩm 
        
        
    }
    
}

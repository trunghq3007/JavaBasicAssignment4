package core;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author HQTrung
 * @Description: class manage phone book
 */
public class BookMemory {
    HashMap<String, Integer> hash = new HashMap<String, Integer>();

    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: .thiết lập dữ liệu...
     * version 1.0
     */
    public void setData() {
        hash.put("Joy", 34543);
        hash.put("Jack", 56765);
        hash.put("Tina", 34567);
    }

    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: .print danh sách trong danh bạ...
     * version 1.0
     */
    public void list() {
        for (Entry<String, Integer> en : hash.entrySet()) {
            System.out.println("Key:" + en.getKey() + "\tValue:"
                    + en.getValue());
        }
    }

    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: Kiểm tra xem số 3443 có tồn tại trong sổ ghi nhớ của bạn hay không.
     * version 1.0
     * @param phoneNumber
     * @return
     */
    public boolean checkExists(int phoneNumber) {
        for (Entry<String, Integer> en : hash.entrySet()) {
            if (en.getValue() == phoneNumber)
                return true;
        }
        return false;
    }

    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: Kiểm tra xem tên Jack có hiện hữu trong sổ ghi nhớ của bạn hay
     * không.....
     * version 1.0
     * @param nameEmp
     * @return boolean
     */
    public boolean checkExists(String nameEmp) {
        for (Entry<String, Integer> en : hash.entrySet()) {
            if (en.getKey().equalsIgnoreCase(nameEmp)) {
                return true;
            }
        }
        return false;
    }

    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: Hiển thị số điện thoại của Tina.....
     * version 1.0
     * @param nameEmp
     * @return int
     */
    public int showPhoneNumber(String nameEmp) {
        // nameEmp is Tina
        for (Entry<String, Integer> en : hash.entrySet()) {
            if (en.getKey() == nameEmp) {
                return en.getValue();
            }
        }
        return -1;
    }


    /**
     * user: HQTrung
     * create date: Oct 11, 2018
     * modified date: Oct 11, 2018
     * content: Xoá số điện thoại của Joy.....
     * version 1.0
     * @param nameEmp
     * @return boolean
     */
    public boolean deleteItem(String nameEmp) {
        for (Entry<String, Integer> en : hash.entrySet()) {
            if (en.getKey().equalsIgnoreCase(nameEmp)) {
                hash.remove(nameEmp);
                return true;
            }
        }
        return false;
    }
}

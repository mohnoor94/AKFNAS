package data;

import java.util.HashMap;
import java.util.Map;

/**
 * Store some data for later uses
 *
 * @author AbuKhleif
 */
public class Data {
    private static Map<String, String> data;
    private static Map<String, String> userData;

    public static Map<String, String> getData() {
        if (data == null) {
            data = new HashMap<>();
        }
        return data;
    }

    public static Map<String, String> getUserData() {
        if (userData == null) {
            userData = new HashMap<>();
        }
        return userData;
    }
}
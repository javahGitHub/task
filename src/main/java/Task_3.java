import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_3 {

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("robocontest", "slcldlkepte");
        words.put("dasturchi", "ottefsdef");
        words.put("shifrlash", "tefysatte");
        words.put("abc", "tcd");
        words.put("hello", "epaal");
        words.put("kelajak", "ppatotp");

        System.out.println(encode("kelajak",words));
    }


    static String encode(String s, Map<String, String> map) {
        Map<Character, Character> encryption = findEncryption(map);
        System.out.println(encryption);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(encryption.get(s.charAt(i)));
        }
        return builder.toString();
    }


    static Map<Character, Character> findEncryption(Map<String, String> words) {
        Map<Character, Character> deEncodes = new HashMap<>();
        List<Character> list=new ArrayList<>();
        for (Map.Entry<String, String> entry : words.entrySet()) {
            for (int i = 0; i < entry.getKey().length(); i++) {

                deEncodes.put(entry.getKey().charAt(i), entry.getValue().charAt(i));
                list.add(entry.getKey().charAt(i));
            }
        }
        System.out.println(deEncodes);
        return deEncodes;
    }
}

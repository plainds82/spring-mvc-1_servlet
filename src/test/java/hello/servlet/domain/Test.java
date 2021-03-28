package hello.servlet.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        Map<String, String> testMap = new HashMap<>();

        putSomethingToMap(testMap);

        testMap.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("s = " + s);
                System.out.println("s2 = " + s2);
            }
        });
    }

    public static void putSomethingToMap(Map<String, String> map) {
        map.put("key1", "value1");
        map.put("key2", "value2");
    }
}

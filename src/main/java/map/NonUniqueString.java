package map;

import java.util.*;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.computeIfPresent(s, (key, val) -> true);
            map.putIfAbsent(s, false);
        }
        return map;
    }

    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String charAt = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(charAt, new ArrayList<>());
            rsl.get(charAt).add(string);

        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = {"two", "three", "four", "five", "six", "seven"};
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : data) {
            String charAt = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(charAt, new ArrayList<>());
            System.out.println(rsl.get(charAt).add(string));
        }
    }
}
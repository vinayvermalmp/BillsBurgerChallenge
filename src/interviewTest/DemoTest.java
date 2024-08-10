package interviewTest;


import java.util.*;

public class DemoTest {

    public static Character firstNonRepeatingCharWithMap(String inputString) {
        if (null == inputString || inputString.isEmpty()) {
            return null;
        }
        Map<Character, Integer> frequency = new HashMap<>();
        for (int outer = 0; outer < inputString.length(); outer++) {
            char character = inputString.charAt(outer);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }
        for (Character c : inputString.toCharArray()) {
            if (frequency.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        System.out.printf("---  "+firstNonRepeatingCharWithMap(input)+"  ---");


        char[] str = input.toCharArray();
        // Set<Character> set  = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for(int i=0; i < str.length; i++) {
            if (list.contains(str[i])) {
                list.add(str[i]);
            }
            /*for (int j = i + 1; j < str.length; j++) {
                if (str[i] != str[j]) {
                    set.add(str[i]);

                }
            }*/
        }
        for (Character temp: list ){
            System.out.print(temp);
        }
    }
}

 public class FirstClass {

        public static int count = 0;

        public static void main(String args[]) {
            String str = "(){}[";
            char[] charArray = str.toCharArray();
            boolean isBal = checkBalance(str, charArray.length);
            System.out.println(isBal);
        }

        public static boolean checkClosingChar(String str, char character, int i) {
            if (i+1 < str.length()) {
                char temp = str.charAt(i+1);
                if (character == temp){
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        public static boolean checkBalance(String str , int n) {
            int i = 0;
            while (i < n) {
                char temp = str.charAt(i);
                if (temp == '(') {
                    count++;
                    if (checkClosingChar(str, ')', i)) {
                        count--;
                        i++;
                    }
                } else if (temp == '[') {
                    count++;
                    if (checkClosingChar(str, ']', i)) {
                        count--;
                        i++;
                    }
                } else if (temp == '{') {
                    count++;
                    if (checkClosingChar(str, '}', i)) {
                        count--;
                        i++;
                    }
                }
                i++;
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

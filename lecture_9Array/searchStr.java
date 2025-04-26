package lecture_9Array;

public class searchStr {
    public static void main(String[] args) {
        String name = "kartik";
        char traget = 't';
        System.out.println(search1(name, traget));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch :str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}

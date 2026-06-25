package recursion;

import java.util.ArrayList;

public class asciiVal {
    public static void main(String[] args) {
        // char ch = 'a';
        // System.out.println(ch + 0);
        // subSeqascii("", "ab");
        System.out.println(subSeqasciiArr("", "ab"));
    }

    static void subSeqascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqascii(p + ch, up.substring(1));
        subSeqascii(p, up.substring(1));
        subSeqascii(p + (ch + 0), up.substring(1));

    }

    static ArrayList<String> subSeqasciiArr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqasciiArr(p + ch, up.substring(1));
        ArrayList<String> right = subSeqasciiArr(p, up.substring(1));
        ArrayList<String> asci = subSeqasciiArr(p + (ch + 0), up.substring(1));
        left.addAll(right);
        left.addAll(asci);
        return left;
    }
}

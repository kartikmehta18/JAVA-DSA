package lecture_9Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(637);
        // list.add(63);
        // list.add(64);
        // list.add(347);
        // list.add(64);
        // list.add(672);
        // list.add(65);
        // list.add(768);
        // System.out.println(list.contains(67));
        // System.out.println(list);
        // list.set(0, 99);

        // System.out.println(list);

        // System.out.println("remove index 2");
        // list.remove(2);
        // System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));;
        }
        System.out.println(list);
    }

}

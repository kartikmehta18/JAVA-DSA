package recursion;

import java.util.ArrayList;

public class serching {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 64, 5 };
        System.out.println(find(arr, 5, 0));
        System.out.println(findind(arr, 5, 0));
        System.out.println(findindLast(arr, 5, arr.length - 1));
        // findindList(arr, 5, 0);
        // System.out.println(list);
        // ArrayList<Integer> list = new ArrayList<>();
        // findindList1(arr, 5, 0, list);
        // System.out.println(list);
        // or
        // ArrayList<Integer> ans = findindList1(arr, 5, 0, new ArrayList<>());
        // System.out.println(ans);
        System.out.println(findindList2(arr, 5, 0));
        

    }

    static boolean find(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || find(arr, target, i + 1);
    }

    static int findind(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findind(arr, target, i + 1);
        }

    }

    static int findindLast(int[] arr, int target, int i) {
        if (i == -1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return findindLast(arr, target, i - 1);
        }

    }

    // static ArrayList<Integer> list = new ArrayList<>();

    // static void findindList(int[] arr, int target, int i) {
    // if (i == arr.length) {
    // return;
    // }
    // if (arr[i] == target) {
    // list.add(i);

    // }
    // findindList(arr, target, i + 1);

    // }

    // another way

    static ArrayList<Integer> findindList1(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);

        }
        return findindList1(arr, target, i + 1, list);

    }

    static ArrayList<Integer> findindList2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);

        }
        ArrayList<Integer> ansFromBelowCall = findindList2(arr, target, i + 1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}
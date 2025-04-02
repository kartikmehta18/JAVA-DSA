package lecture_7;

public class overload {
    public static void main(String[] args) {
        fun(9);
        fun("kartik");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

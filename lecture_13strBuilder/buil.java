package lecture_13strBuilder;

public class buil {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tonny");
        System.out.println(str);
        // char at index 0
        System.out.println(str.charAt(0));

        // replace str val at indx
        str.setCharAt(0, 'p');
        System.out.println(str);

        // insert value
        str.insert(0, 's');
        System.out.println(str);

        // delete
        str.delete(2, 3);
        System.out.println(str);

    }
}

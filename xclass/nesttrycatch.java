package xclass;

public class nesttrycatch {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        try{
            System.out.println("welcome");
            try{
                System.out.println(marks[9]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sry index not exist");
                System.out.println("exc l 2");
            }
        }
        catch(Exception e){
            System.out.println("exc l 1");
        }
    }
}
//5,7,8,9,10

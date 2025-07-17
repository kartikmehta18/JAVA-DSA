package lecture_5.pattern;

public class p1 {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern1(int n){
        for(int i=1; i <=n; i++){
        for(int j=1; j <=n; j++){

            System.out.print("* ");
        }
        System.out.println();
        
        }
    }
    static void pattern2(int n){
        for(int i=1; i <=n; i++){
        for(int j=1; j <=i; j++){

            System.out.print("* ");
        }
        System.out.println();
        
        }
    }
    static void pattern3(int n){
        for(int i=1; i <=n; i++){
        for(int j=1; j <=n-i+1; j++){
        // for(int j=n; j >=i; j--){

            System.out.print("* ");
        }
        System.out.println();
        
        }
    }
}

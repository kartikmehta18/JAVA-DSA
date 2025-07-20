package recursion;

public class r2 {

     public static void main(String[] args) {
        message(1);
    }
    
    static void message(int n){
        if(n==5){
            System.out.println("Jai Jinendra"+ 5);
            return;
        }
        System.out.println("Jai Jinendra"+ n);
        // tail recursion because it is last function call
        message(n+1);
    }
}

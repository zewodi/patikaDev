/*
1 1 2 3 5 8 13 | fibonacci diziler ile
 */
package fibonaccidiziler;

public class FibonacciDiziler {

    public static void main(String[] args) {
        
        int[] fib = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        
        for (int i = 0; i < 8; i++) {
            fib[i+2]=fib[i+1]+fib[i];
        }
      
        for (int i = 0; i < 10; i++) {
            System.out.println(fib[i]);
        }
    }   
}

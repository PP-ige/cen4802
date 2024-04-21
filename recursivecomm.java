/**
 * recursivecomm class
 * @author Paige Pulliam
 * @version 1.0
 */
public class recursivecomm{

    /**
     * This method uses a recursive call
     * @param n
     * @return the nth fibonacci number
     * @since 1.0
     */

    public static int fib(int n){
      if( n<=1)
        return n;
      
      return fib(n-1) + fib(n-2);
    }
    
     /**
     *  This method creates the result by calling the method fib
     * @param n
     * @param y
     * @return result of 'n'th term
     * @since 1.0
     */
    public static void main(String args[]){
        int n =10;
        int y = fib(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is "+y);
    }//end of main
  }//end of recursive
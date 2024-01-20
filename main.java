import java.util.*;

public class code{
  //static method which returns nth fibonacci number
  public static int fib(int n){
    if( n<=1)
      return n;
    
    //recursive call to add last 2 fibonacci numbers
    return fib(n-1) + fib(n-2);
  }
  
  public static void main(String args[]){
    int n =10;
    
    //call the method with n
    int y = fib(n);
    
    //output the result
    System.out.println("The "+n+"th term of the Fibonacci sequence is "+y);
  }
}
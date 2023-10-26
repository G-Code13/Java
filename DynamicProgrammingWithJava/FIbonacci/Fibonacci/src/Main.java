public class Main {
    public static void main(String[] args) throws Exception {
        
        //Fibonacci sequence that stores the value in a memo.
        System.out.println("Fibonacci Sequence \t" + Fibonacci.fibonacci(10)); 


        //Tribonacci sequence that stores the value in a memo. 
        System.out.println("Tribonacci Sequence \t" + Tribonacci.tribonacci(8));
    };
};
/*Dynamic programming- Simplifies complicated problems by breaking them down into smaller sub-problems in a recursive manner
 * Memoization- technique used to speed up programs by storing results of function calls in a memo and return the cached results when duplicates a found
 * Memoization in Dynamic Programming- is a technique used for improving a programs performance of recursive algorithms. It involves rewriting recursive algorithms so that as answers to problems are found, they are stored in an array. Recursive calls can look up the array instead of re-calculating the results.
  */
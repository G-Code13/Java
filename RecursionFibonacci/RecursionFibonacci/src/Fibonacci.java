public class Fibonacci {
    
    Fibonacci(){

    }

    static int fib(int n){

        if(n <= 1){
            return n;
        }
        else{ 
            return fib(n -1) + fib(n - 2);
        }
    };

    static int fib2(int n){
        
        if(n <= 1){
            return n;
        }
        else{
            return n + n + fib(n - 1) + 1;
        }
    };
};

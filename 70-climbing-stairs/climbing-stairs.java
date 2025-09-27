class Solution {

    public static int [] term = new int [1000]; 

    public int climbStairs(int n) {
        return fib(n);
    }

    public int fib(int n){
        if (n <= 1)
            return 1;
        if (term[n] != 0)
        return term[n];

    else {
        term[n] = fib(n - 1) + 
                  fib(n - 2);

        return term[n];
        }
    }

}
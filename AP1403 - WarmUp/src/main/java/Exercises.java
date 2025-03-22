public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        if(n == 1) return false;
        if(n<100000){
            for(int i=2;i*i<=n;i++){
                if(n%i==0) return false;
            }
        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
        }

        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        long fibonacci = 0;
        long fibonacci2 = 1;
        long newFib;
        if(n < 1) {
        switch ((int)n){
            case 1:
                return 1;
            case 0:
                return 0;
        }} else if (n<0) {
            return -1;
        }
        for(int i=2;i<=n;i++){
            newFib = fibonacci + fibonacci2;
            if(newFib>n) return -1;
            if(newFib==n) return i;
            fibonacci = fibonacci2;
            fibonacci2 = newFib;
        }
        return -1;
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        char[][] triangle = new char[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new char[i+1];
            for (int j = 0; j <= i; j++) {
                if (i == 0||j == i||i==n-1||j==0) triangle[i][j]='*';
                else triangle[i][j] = ' ';
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
    }
}

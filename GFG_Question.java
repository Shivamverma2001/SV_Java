import java.util.*;

class GFGM {
    void absolute(int n) {
        // Math.abs(n);
        if (n < 0)
            System.out.println("Absolute value is " + (-n));
        else
            System.out.println("Absolute value is " + (n));
    }

    double cToF(int c) {
        return ((c * 9) / 5 + 32);
    }

    long factorial(int n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    void quadraticRoots(int a, int b, int c) {
        System.out.println("For Quadratic roots");
        // ArrayList<Integer> aa = new ArrayList<>();
        double d = (b * b) - (4.0 * a * c);
        if (d < 0) {
            System.out.println(-1 - 1);
            // aa.add(-1);
            // return aa;
        } else {
            d = Math.sqrt(d);
            int max = (int) Math.floor((-b + d) / (2.0 * a));
            int min = (int) Math.floor((-b - d) / (2.0 * a));
            System.out.print(max);
            System.out.println(" " + min);
            // aa.add(Math.max(max, min));
            // aa.add(Math.min(max, min));
            // return aa;
        }
    }

    int digitsInFactorial(int N) {
        // code here
        // number of digits == floor(log10(N)+1);
        // Number of digits in the N! = log10(N!)
        // N! = (N) x (N-1) x (N-2) x . . . x 3 x 2 x 1
        // log10(N!) = log10((N) x (N-1) x (N-2) x . . . x 2 x 1)
        // log10(N!) = log10(N) + log10(N-1) + . . . + log10(2) + log10(1)
        double digits = 0.0;
        if (N < 0)
            return 1;
        for (int i = 1; i <= N; i++) {
            digits += Math.log10(i);
        }
        return (int) Math.floor(digits) + 1;
    }

    double termOfGP(int A, int B, int N) {
        // Your code here
        return (A * Math.pow((double) B / A, N - 1));
    }

    boolean isPrime(int n) {
        // code here
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    int exactly3Divisors(int N) {
        // Your code her
        int ans = 0;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime(i))
                ans++;
        }
        return ans;

    }

    long sumUnderModulo(long a, long b) {
        // code here
        long s1 = a % (long) (Math.pow(10, 9) + 7);
        long s2 = b % (long) (Math.pow(10, 9) + 7);
        long s3 = (s1 + s2) % (long) (Math.pow(10, 9) + 7);
        return s3;
    }

    long multiplicationUnderModulo(long a, long b) {
        // add your code here
        long s1 = a % (long) (Math.pow(10, 9) + 7);
        long s2 = b % (long) (Math.pow(10, 9) + 7);
        long s3 = (s1 * s2) % (long) (Math.pow(10, 9) + 7);
        return s3;
    }
}

class GFGBM {
    public int getFirstSetBit(int n) {
        int i = 0;
        while (n > 0) {
            if (((n >> i) & 1) == 1)
                return i + 1;
            i++;
        }
        return i;
    }

    public int posOfRightMostDiffBit(int m, int n) {
        m = m ^ n;
        if (m == 0)
            return -1;
        int i = 0;
        while (m > 0) {
            if (((m >> i) & 1) == 1)
                return i + 1;
            i++;
        }
        return i;
    }

    boolean checkKthBit(int n, int k) {
        // Your code here
        n = n >> k;
        if ((n & 1) == 1)
            return true;
        return false;
    }

    boolean isSparse(int n)// if it has consecutive 1
    {
        int c = n >> 1;
        c = n & c;
        if (c == 0)
            return true;
        return false;
    }

    int maxConsecutiveOnes(int N) {
        int c = 0;
        while (N != 0) {
            N = (N & (N << 1));
            c++;
        }
        return c;
    }

    int greyConverter(int n) {
        if (n == 0)
            return 0;
        return n ^ (n >> 1);
    }
}

public class GFG_Question {
    public static void main(String args[]) {
        System.out.println("Mathematics Problems");
        System.out.println();
        GFGM m = new GFGM();
        m.absolute(-100);
        System.out.println("Celcius to Ferenhite " + m.cToF(32));
        System.out.println("Factorial of number is  " + m.factorial(10));
        m.quadraticRoots(1, -7, 12);
        System.out.println("Number of digits in Factorial  " + m.digitsInFactorial(120));
        System.out.println("GP  " + (int) m.termOfGP(1, 2, 5));
        System.out.println("Primarility Test  " + m.isPrime(31));
        System.out.println("Exactly 3 divisors " + m.exactly3Divisors(10));
        System.out.println("Addition under modulo " + m.sumUnderModulo(1234566789, 1223455667));
        System.out.println("Multiplication under modulo " + m.multiplicationUnderModulo(1234566789, 1223455667));
        System.out.println();
        System.out.println();
        System.out.println("Bit Magic Problems");
        System.out.println();
        GFGBM bm = new GFGBM();
        System.out.println("Your first set bit is at " + bm.getFirstSetBit(3665));
        System.out.println("Position of right most set bit is at " + bm.posOfRightMostDiffBit(19, 10));
        System.out.println("Kth bit set or not " + bm.checkKthBit(16, 2));
        System.out.println("Number is parse or not " + bm.isSparse(3));
        System.out.println("Max consecutive 1's " + bm.maxConsecutiveOnes(45));
        System.out.println("Gray code to binary converter " + bm.greyConverter(14));
    }
}

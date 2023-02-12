import java.util.*;

class Mathematics {// O(d) d is no of digits
    int count(int n) {
        int res = 0;
        while (n > 0) {
            res++;
            n /= 10;
        }
        return res;
    }

    boolean Palindrom(int n) {// O(d) d is no of digits
        int tem = n;
        int rev = 0;
        while (tem > 0) {
            rev = rev * 10 + tem % 10;
            tem /= 10;
        }
        if (rev == n)
            return true;
        return false;
    }

    int fatorial(int n) {// O(n)
        int ans = 1;
        while (n > 0) {
            ans = ans * n;
            n--;
        }
        return ans;
    }

    int trailingZeroes(int n) {
        int count = 0;
        // for (int i = 5; i <= n; i *= 5) {
        // count += n / i;
        // }
        while (n > 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    int GCD_Naive1(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }

    int GCD_Naive2(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    int GCD(int a, int b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    int LCM_Naive(int a, int b) {// O(N)
        int ans = Math.max(a, b);
        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        return ans;
    }

    int LCM(int a, int b) {
        int gcd = GCD(a, b);
        int ans = a * b;
        ans = ans / gcd;
        return ans;
    }

    boolean Prime_Naive(int n) {// O(n)
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    boolean Prime_Naive2(int n) {// O(n^1/2)
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    boolean Prime(int n) {// 3 times more faster than Prime_Naive2
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i += 5) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    void Prime_Factors_Naive1(int n) {// O(N^2logN)
        for (int i = 2; i < n; i++) {
            if (Prime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
        System.out.println();
    }

    void Prime_Factors_Efficient1(int n) {// O(N^1/2)
        for (int i = 2; i * i < n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1)
            System.out.println(n);
    }

    void Prime_Factors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n /= 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n /= (i + 2);
            }
        }
        if (n > 3)
            System.out.println(n);
    }

    void printDivisor(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        for (; i > 1; i--) {
            if (n % i == 0)
                System.out.print((n / i) + " ");
        }
        System.out.println();
    }

    void seive(int n) {// O(NloglogN)
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println();
    }
}

class BitMagic {
    void operators(int a, int b) {
        System.out.println("OR " + (a | b));
        System.out.println("AND " + (a & b));
        System.out.println("XOR " + (a ^ b));
        System.out.println("NOT " + (~a));// 2^23-x-1=2^32-a
        System.out.println("LEFT SHIFT OPERATOR << " + (a << 2));// x*2^y
        System.out.println("LEFT SHIFT OPERATOR << of -1 " + (-1 << 2));
        System.out.println("RIGHT SHIFT OPERATOR >> " + (a >> 2));// floor(x/2^y)
        System.out.println("SIGNED RIGHT SHIFT OPERATOR >> OF -2 " + (-2 >> 2));
        System.out.println("UNSIGNED RIGHT SHIFT OPERATOR >>> OF -2 " + (-2 >>> 1));
    }

    boolean kthSetBit(int a, int n) {
        // by left shift operator
        // if ((a & (1 << (n - 1))) != 0)
        // return true;
        if (((a >> (n - 1)) & 1) == 1)
            return true;
        return false;
    }

    int countSetBits(int n) {
        int result = 0;
        while (n > 0) {
            n = n & (n - 1);
            result++;
        }
        return result;
    }

    boolean powerOfTwo(int n) {
        if (n == 0)
            return false;
        return ((n & (n - 1)) == 0);
    }

    int oOO(int a[]) {// a^a=0,a^0=a
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res = res ^ a[i];
        }
        return res;
    }

    int mNZTO(int a[]) {// 1,5,3,2
        int res = 0, res1 = 0;
        for (int i = 0; i < a.length; i++) {
            res = res ^ a[i];
            res1 = res1 ^ (i + 1);
        }
        res = res ^ res1;
        return res;
    }

    void tOON(int a[]) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {// to cancel repeat terms
            xor = xor ^ a[i];
        }
        int rt = xor & ~(xor - 1);// mto find right most set bit
        // then convert it into two groups one for set bit and another for non set bit
        int res = 0, res1 = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & rt) != 0) {
                res ^= a[i];
            } else {
                res1 ^= a[i];
            }
        }
        System.out.println("Your first odd non repeating term is " + res);
        System.out.println("Your second odd non repeating term is " + res1);
    }

    void printPowSet(String a) {
        char s[] = a.toCharArray();
        int n = a.length();
        int powsize = (int) Math.pow(2, n);
        for (int counter = 0; counter < powsize; counter++) {
            for (int j = 0; j < n; j++) {
                if ((counter & (1 << j)) != 0)
                    System.out.print(s[j]);
            }
            System.out.println();
        }
    }
}

class Recursion {
    void printNToOne(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printNToOne(n - 1);
    }

    void printOneToN(int n) {
        if (n == 0)
            return;
        printOneToN(n - 1);
        System.out.print(n + " ");
    }

    int sumNaturalNo(int n) {
        if (n == 0 || n == 1)
            return n;
        return n + sumNaturalNo(n - 1);
    }

    boolean palindromRec(String s, int start, int end) {
        if (start >= end)
            return true;
        return ((s.charAt(start) == s.charAt(end)) && (palindromRec(s, start + 1, end - 1)));
    }

    int sumOfDigits(int n) {
        if (n < 9)
            return n;
        return (sumOfDigits(n / 10) + (n % 10));
    }

    int ropeCutting(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < -1)
            return -1;
        int m = Math.max(ropeCutting(n - a, a, b, c), ropeCutting(n - b, a, b, c));
        m = Math.max(m, ropeCutting(n - c, a, b, c));
        if (m == -1)
            return -1;
        return m + 1;
    }

    void subsets(String s, String cur, int i) {
        if (i == s.length()) {
            System.out.print(cur + " ");
            return;
        }
        subsets(s, cur, i + 1);
        subsets(s, cur + s.charAt(i), i + 1);
    }

    void TOH(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        TOH(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n - 1, B, A, C);
    }

    int josephusProblem(int n, int k) {
        if (n == 1)
            return 0;
        return (josephusProblem(n - 1, k) + k) % n;
    }

    int countSubset(int arr[], int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return countSubset(arr, n - 1, sum) + countSubset(arr, n - 1, sum - arr[n - 1]);
    }

    String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    void permute(String s, int i) {
        if (i == s.length() - 1) {
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swap(s, i, j);
            permute(s, i + 1);
            s = swap(s, i, j);
        }
    }
}

class Array {
    void traverse(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void insert(int arr[], int index, int lastpos, int number) {
        for (int i = lastpos; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = number;
        traverse(arr);
    }

    void delete(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        traverse(arr);
    }

    void search(int arr[], int number) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == number) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("Not present");
    }
}

public class Gfg_Prac {
    public static void main(String[] args) {
        System.out.println("Mathematics");
        System.out.println();
        Mathematics m = new Mathematics();
        int c = m.count(4567789);
        System.out.println("Count " + c);
        boolean p = m.Palindrom(373);
        System.out.println("Palindrom " + p);
        int fac = m.fatorial(10);
        System.out.println("fatorial " + fac);
        int tZeroes = m.trailingZeroes(50);
        System.out.println("trailingZeroes " + tZeroes);
        int gcdN1 = m.GCD_Naive1(12, 15);
        System.out.println("GCD_Naive1 " + gcdN1);
        int gcdN2 = m.GCD_Naive2(12, 15);
        System.out.println("GCD_Naive2 " + gcdN2);
        int gcd = m.GCD(15, 12);
        System.out.println("GCD " + gcd);
        int lcmN = m.LCM_Naive(12, 15);
        System.out.println("LCM_Naive " + lcmN);
        int lcm = m.LCM(12, 15);
        System.out.println("LCM " + lcm);
        boolean prime1 = m.Prime_Naive(23);
        System.out.println("Prime_Naive " + prime1);
        boolean prime2 = m.Prime_Naive2(24);
        System.out.println("Prime_Naive2 " + prime2);
        boolean prime = m.Prime(29);
        System.out.println("Prime " + prime);
        System.out.print("Prime_Factors_Naive1 ");
        m.Prime_Factors_Naive1(24);
        System.out.print("Prime_Factors_Efficient1 ");
        m.Prime_Factors_Efficient1(35);
        System.out.print("Prime_Factors ");
        m.Prime_Factors(115);
        System.out.print("Print Divisor ");
        m.printDivisor(78);
        System.out.print("Seive ");
        m.seive(23);
        System.out.println();
        System.out.println();

        System.out.println("Bit Magic Operators");
        System.out.println();
        BitMagic bM = new BitMagic();
        bM.operators(5, 6);
        System.out.println("kth Set bit " + bM.kthSetBit(5, 3));
        System.out.println("Brian and Kerningham Algorithm Count Number of Set bit " + bM.countSetBits(10));
        System.out.println("Number is power of two or not " + bM.powerOfTwo(10));
        int a[] = new int[] { 2, 3, 4, 2, 4 };
        System.out.println("One odd occuring number is " + bM.oOO(a));
        int b[] = new int[] { 1, 5, 3, 2 };
        System.out.println("Your Missing number in array from 0 to N is " + bM.mNZTO(b));
        System.out.println("Two odd non repeating term");
        int cc[] = new int[] { 3, 4, 3, 4, 5, 4, 4, 6, 7, 7 };
        bM.tOON(cc);
        bM.printPowSet("abc");
        System.out.println();
        System.out.println();

        System.out.println("Recursion");
        System.out.println();
        Recursion r = new Recursion();
        System.out.print("Print N to 1 ");
        r.printNToOne(10);
        System.out.println();
        System.out.print("Print 1 to N ");
        r.printOneToN(10);
        System.out.println();
        System.out.println("Sum natural number " + r.sumNaturalNo(10));
        System.out.println("Palindrom or not " + r.palindromRec("abca", 0, 3));
        System.out.println("Sum of Digits " + r.sumOfDigits(123));
        System.out.println("Rope Cutting Problem " + r.ropeCutting(14, 8, 4, 2));
        System.out.print("Subset problem ");
        r.subsets("ABC", "", 0);
        System.out.println();
        System.out.print("Tower Of Hanoi problem ");
        r.TOH(3, 'A', 'B', 'C');
        System.out.print("Josephus problem " + r.josephusProblem(7, 3));
        System.out.print("Count subset problem " + r.countSubset(new int[] { 10, 20, 25, 15, 40 }, 5, 25));
        r.permute("ABCD", 0);
        System.out.println();
        System.out.println();
        System.out.println("Arrays");
        Array ay = new Array();
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        ay.insert(arr, 2, 4, 6);
        ay.delete(arr, 2);
        ay.search(arr, 5);
    }
}

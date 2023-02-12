public class MathGFG{
    static void countDigit(int n){
       int c=0;
       while(n!=0){
           n/=10;
           c++;
       }
       System.out.println("The digit is of "+c+" count");
    }


    static void palindrom(int n){
        int b=0,temp=n;
        while(temp!=0){
            b=b*10+temp%10;
            temp/=10;
        }
        if(b==n){
            System.out.println("Yes the digit is palindrom");
        }
        else{
            System.out.println("No the digit is palindrom");
        }
    }


    static void factorial(int n){
        int f=1;
        if(n==0||n==1){
            System.out.println(1);
        }
        for(int i=2;i<=n;i++){
            f*=i;
        }
        System.out.println(f);
    }


    static void trailingZeroes(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res=res+n/i;
        System.out.println(res);
        }
    }


    static void naive_gcd(int a,int b){

        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0&&b%res==0){
                break;
            }
            res--;
        }
        System.out.println("The GCD of a and b are " +res);
    }


    static int euclidean_gcd(int a,int b){
        //O(min(a,b))
        if(b==0){
            return a;
        }
        else
            return euclidean_gcd(b, a%b);
    }


    static void naiveLCM(int a,int b){//O(a*b-max(a,b))
        int res=Math.max(a,b);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        System.out.println(res);
    }

    static int lcm(int a,int b){//O(log(min(a,b)))
        //a*b=lcm(a,b)*gcd(a*b);
        return a*b/euclidean_gcd(a,b);
    }

    static boolean naiveIsPrime(int n){//O(n)
        if(n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }

    static void primeFactors(int n){
        if(n<=1){
            System.out.println("no it is not prime");
        }
        else{
            for(int i=2;i*i<n;i++){
                while(n%i==0){
                    System.out.println(i);
                    n/=i;
                }
            }
            if(n>1){
                System.out.println(n);
            }
        }
    }

    static void printDivisors(int n){
        int i;
        for(i=1;i*i<n;i++){//O(n^1/2)
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }
    static void seiveOfEratosthenes(int n){
        //In register
    }
    static int power(int x,int n){//O(logn)
        int res=1;
        while(n>0){
            if(n%2!=0)
            res=res*x;
            x=x*x;
            n=n/2;//n>>1
        }
        return res;
    }


    public static void main(String []args){
       // int a=251;
      //  countDigit(a);

       // palindrom(a);

        //factorial(a);

       // trailingZeroes(a);

        //naive_gcd(224, 788);

        //int a=euclidean_gcd( 224,788);
        //System.out.println(a);

        //naiveLCM(4,6);

      //  int a=lcm(4,6);
      //  System.out.println(a);

   /*   if(naiveIsPrime(7)==true){
          System.out.println("yes it is prime");
      }
    else{
        System.out.println("No it is not prime");
    }*/

    //primeFactors(84);

    //printDivisors(100);

    int a=power(3,5);
    System.out.println(a);
    }
}
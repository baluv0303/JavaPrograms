package basicConcepts;

public class Recursion {

    public static void main(String[] args){
        int n =5;
//        printNumbers(n);
//        printReverse(n);
       System.out.println(sum(n));
       System.out.println(factorial(n));
    }

    public static void printNumbers(int n){
        if(n ==0){
            return;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    public static void printReverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printReverse(n-1);
    }

    public static void printEvenNumber(int n){
        if(n%2 !=0){
            n--;
        }
        if(n==0){
            return;
        }
        printEvenNumber(n-2);
        System.out.println(n);
    }

    public static void printOddNumbers(int n){
        if(n%2 == 0){
            n--;
        }

        if(n <= 0){
            return;
        }
        printOddNumbers(n-2);
        System.out.println(n);
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n* factorial(n-1);
    }
}


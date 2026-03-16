// Function :- function is a block of code which take some input, do some operation and return output

// public static in begining of every function
// it is a returntype void :- means function doesn't return anything

import java.util.Scanner;

public class function {
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num1 = sc.nextInt();
    //     int num2 = sc.nextInt();

    //     int sum = sumOfTwoNumber(num1, num2);
    //     System.out.println(sum);


    //     // printMyName(name);// call kiya function ko
    // }

    // public static int sumOfTwoNumber(int num1, int num2){
    //     int sum = num1 + num2;
    //     return sum;
    // }

    // public static int product(int a, int b){
    //     int product = a * b;
    //     return product;
    // }

     // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int ans = product(a, b);
    //     System.out.println(ans);
    // }

    public static void fact(int num){
        
        if (num<0){
            System.out.println("Factorial is not possible");
            return;
        }

        int fact = 1;
        for (int i=num; i>=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fact(num);
    }
}

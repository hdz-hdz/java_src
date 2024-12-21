package day_11_12;


import java.util.Scanner;

public class Fibonacci {

        // 递归方法计算斐波那契数列
        public static int fibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
        }
    }


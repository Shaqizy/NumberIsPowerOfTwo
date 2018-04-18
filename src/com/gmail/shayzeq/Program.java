package com.gmail.shayzeq;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число для проверки : ");
        int v = sc.nextInt();
        boolean isPowerOfTwo = (v & (v - 1)) == 0;
        sc.close();

        System.out.println("Результат проверки числа = " + isPowerOfTwo);
    }
}

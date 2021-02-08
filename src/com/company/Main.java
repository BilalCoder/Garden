package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area of terrace");
        int a = sc.nextInt();
        if(a<=0)
            invalid();
        System.out.println("Enter the diameter of the pot");
        int b = sc.nextInt();
        if(b<=0 || b>a)
            invalid();

        double len = Math.sqrt(a);
        System.out.println((int)(len/b*12));

    }


    public static void invalid(){
        System.out.println("Invalid Input");
        System.exit(0);
    }
}

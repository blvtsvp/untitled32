package com.company;

import java.util.Scanner;

public class Main {
    public static double triangle(int a){
        return Math.pow(a,3.0)*(Math.sqrt(3)/4);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(triangle(a)*6);
    }
}

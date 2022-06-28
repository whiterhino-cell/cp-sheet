package Cp01_Implimentation;

import java.util.Scanner;

public class Cp01_Bit_pp {
    public static void main(String[] args) {
        int x=0;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while (n-->0){
            String str=sc.next();
            switch (str){
                case "X++":
                case "++X":x++;break;
                case "X--":
                case "--X":x--;break;
            }
        }
        System.out.println(x);
    }
}

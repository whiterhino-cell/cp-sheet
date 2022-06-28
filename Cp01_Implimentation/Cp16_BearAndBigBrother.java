package Cp01_Implimentation;

import java.util.Scanner;

public class Cp16_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt(),b= sc.nextInt(),c=0;
        while (a<=b){
            a*=3;
            b*=2;c++;
        }
        System.out.println(c);
    }
}

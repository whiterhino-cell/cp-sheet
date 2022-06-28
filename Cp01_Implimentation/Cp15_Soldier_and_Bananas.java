package Cp01_Implimentation;

import java.util.Scanner;

public class Cp15_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  k= sc.nextInt(), n= sc.nextInt(),w= sc.nextInt();
        int ans=(k*w*(w+1)/2-n);
        if (ans>0)
            System.out.println(ans);
        else
            System.out.println("0");
    }
}

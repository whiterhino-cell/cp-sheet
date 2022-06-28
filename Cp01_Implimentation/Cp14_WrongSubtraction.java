package Cp01_Implimentation;

import java.util.Scanner;

public class Cp14_WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),k= sc.nextInt();
        while (k>0){
            int d=n%10;
            if(d==0){
                n/=10;k--;
            }else if (d>=k){
                n=n-k;k=0;
            }else {
                n-=d;
                k-=d;
            }
        }
        System.out.println(n);
    }
}

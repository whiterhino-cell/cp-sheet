package Cp01_Implimentation;

import java.util.Scanner;

public class Cp06_SumRoundNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int num= sc.nextInt();
            int count=0,f=0;
            int num2=num;

            while (num2>0){
                int d=num2%10;
                num2/=10;
                if (d!=0){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
            while (num>0){
                int d=num%10;
                num/=10;
                if (d!=0){
                    System.out.print((d*(int)Math.pow(10,count))+" ");
                }
                count++;
            }
            System.out.println();
        }
    }
}

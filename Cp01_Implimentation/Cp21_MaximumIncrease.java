package Cp01_Implimentation;

import java.util.Scanner;

public class Cp21_MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        int max=0,count=0,pre=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if (pre<arr[i]){
                count++;
                pre=arr[i];
                max=Math.max(count,max);
            }else {
                pre=arr[i];
                count=1;
            }
        }
        System.out.println(max);
    }
}

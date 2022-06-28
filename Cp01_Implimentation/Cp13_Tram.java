package Cp01_Implimentation;

import java.util.Scanner;

public class Cp13_Tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][]arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]= sc.nextInt();
            arr[i][1]= sc.nextInt();
        }
        int sum=0,max=0;
        for (int i = 0; i < n; i++) {
            sum=sum-arr[i][0]+arr[i][1];
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}

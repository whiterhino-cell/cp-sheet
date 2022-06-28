package Cp01_Implimentation;

import java.util.Scanner;

public class Cp10_InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if (arr[i]==1)count++;
        }
        if (count==0)
            System.out.println("easy");
        else
            System.out.println("hard");
    }
}

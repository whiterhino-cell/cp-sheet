package Cp01_Implimentation;

import java.util.Scanner;

public class Cp09_Arrival_ofTheGeneral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int max=arr[0],maxP=0,min=arr[0],minP=0;
        for (int i = 0; i < n; i++) {
            if (max<arr[i]){
                max=arr[i];maxP=i;
            }
            if (min>=arr[i]){
                min=arr[i];minP=i;
            }
        }
        if (maxP<minP){
            System.out.println((maxP+(n-1-minP)));
        }else {
            System.out.println((maxP+(n-1-minP)-1));
        }
    }
}

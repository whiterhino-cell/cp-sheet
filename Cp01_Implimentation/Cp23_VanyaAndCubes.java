package Cp01_Implimentation;

import java.util.Scanner;

public class Cp23_VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt(),count=0,sum=1;
            for (int i = 1; n>=sum ; i++) {
                n-=sum;
                count++;
                sum+=i+1;
//                System.out.println("n : "+n+" sum : "+sum);
            }
            System.out.println(count);


    }
}

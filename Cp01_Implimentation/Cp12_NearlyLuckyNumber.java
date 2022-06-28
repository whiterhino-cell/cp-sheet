package Cp01_Implimentation;

import java.util.Scanner;

public class Cp12_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        if (s.length()==0){
            System.out.println("NO");
            return;
        }
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='4'||ch=='7'){
                count++;
            }
        }
        if (count==4||count==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

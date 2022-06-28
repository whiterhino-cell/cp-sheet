package Cp01_Implimentation;

import java.util.Scanner;

public class Cp18_WordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next(),ans="";
        char ch=s.charAt(0);
        if('a'<=ch&&ch<='z'){
            ans=ans+(char)(ch-' ')+s.substring(1,s.length());
        }else ans=s;
        System.out.println(ans);

    }
}



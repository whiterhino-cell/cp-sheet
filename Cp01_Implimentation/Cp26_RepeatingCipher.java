package Cp01_Implimentation;

import java.util.Scanner;

public class Cp26_RepeatingCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        String str= sc.next(),ans="";
        int x=0;
        for (int i = 0; x < l; i++) {

            ans+=str.charAt(x);
            x+=i+1;
        }
        System.out.println(ans);
    }
}

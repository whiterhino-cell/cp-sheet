package Cp01_Implimentation;

import java.util.Scanner;

public class Cp06_SumRoundNumbers2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int c=0;
            String str = sc.next();
            int l=str.length();
            for (int i = 0; i < l; i++) {
                if(str.charAt(i)!='0')c++;
            }
            System.out.println(c);
            for (int i = 0; i < l; i++) {
                int d =str.charAt(i)-'0';
                if (d!=0) {
                    int ans = d * (int) Math.pow(10, l - i - 1);
                    System.out.print(ans + " ");
                }
            }
            System.out.println();

        }
    }
}

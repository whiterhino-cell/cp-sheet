package Cp01_Implimentation;

import java.util.Scanner;

public class Cp02_ChewbaccaNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num= sc.next(),ans="";
        for (int i = 0; i < num.length(); i++) {
            int t=num.charAt(i)-'0';
            if (i==0&&t==9) {
                ans += t;
            }else if (t<(9-t)) {
                ans += t;
            }else {
                ans += (9 - t);
            }
        }
        System.out.println(ans);
    }
}

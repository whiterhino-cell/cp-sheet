package Cp01_Implimentation;

import java.util.Arrays;
import java.util.Scanner;

public class Cp19_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s= sc.next(), ans="";
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String st=new String(ch);
        int l=s.length();
        for (int i = l/2; i < l; i++) {
            if (i==l-1){
                ans=ans+st.charAt(i);
            }else {
                ans=ans+st.charAt(i)+"+";
            }
        }
        System.out.println(ans);
    }
}

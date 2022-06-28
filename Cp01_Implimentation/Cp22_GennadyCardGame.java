package Cp01_Implimentation;

import java.util.Scanner;

public class Cp22_GennadyCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st= sc.next();
        String []arr=new String[5];
        int flag=0;
        for (int i = 0; i < 5; i++) {
            arr[i]= sc.next();
            if (arr[i].charAt(0)==st.charAt(0)||arr[i].charAt(1)==st.charAt(1)){
                flag=1;
            }
        }
        System.out.println(flag==1?"YES":"NO");
    }
}

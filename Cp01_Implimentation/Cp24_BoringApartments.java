package Cp01_Implimentation;

import java.util.Scanner;

public class Cp24_BoringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String s= sc.next();
            int l=s.length(),n=(int)(s.charAt(0)-'0');
            int ans =(n-1)*10+(l*(l+1))/2;
            System.out.println(ans);
        }
    }
}

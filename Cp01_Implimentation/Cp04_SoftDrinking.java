package Cp01_Implimentation;

import java.util.Scanner;

public class Cp04_SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n= sc.nextInt(), k= sc.nextInt(), l= sc.nextInt(),
                c= sc.nextInt(), d= sc.nextInt(), p= sc.nextInt(), nl= sc.nextInt(), np= sc.nextInt();
        int aa=(k*l)/nl;
        int bb=c*d;
        int cc=(p)/np;
        int ans=Math.min(aa,bb);
        ans=Math.min(ans,cc);
        ans/=n;
        System.out.println(ans);

    }
}

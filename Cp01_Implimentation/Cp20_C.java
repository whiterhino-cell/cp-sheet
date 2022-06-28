package Cp01_Implimentation;

import java.util.Scanner;

public class Cp20_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int a,b,n,c=0,sum=0,t;
//        t= sc.nextInt();
//        while (t-->0){
//            sum=0;c=0;
//            a= sc.nextInt();
//            b= sc.nextInt();
//            n= sc.nextInt();
//            while(sum <= n){
//                if(a > b){
//                    b += a;
//                    sum = b;
//                    c++;
//                }
//                else{
//                    a += b;
//                    sum = a;
//                    c++;
//                }
//                if(sum > n){
//                    break;
//                }
//            }
//            System.out.println(c);
//        }

        alter();
    }

    private static void alter() {
        Scanner sc=new Scanner(System.in);
        int a,b,n,c=0,sum=0,t;
        t= sc.nextInt();
        while (t-->0){
            sum=0;c=0;
            a= sc.nextInt();
            b= sc.nextInt();
            n= sc.nextInt();
            while(sum <= n){
               int min=Math.min(a,b);
               int max=Math.max(a,b);
               b=max;a=min;
               a+=b;
               sum=a;c++;
            }
            System.out.println(c);
        }
    }
}

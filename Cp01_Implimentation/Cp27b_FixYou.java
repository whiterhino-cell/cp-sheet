package Cp01_Implimentation;

import java.util.Scanner;

public class Cp27b_FixYou {

    public static void main(String[] args) {
        try {
            tryF();
        }   catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void tryF() {
        Scanner sc1=new Scanner(System.in);
        int t= sc1.nextInt();
        while (t-->0){
            int n= sc1.nextInt(), m= sc1.nextInt();
            String arr[]=new String[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc1.next();
            }
            int count=0;
            for (int i = 0; i < n; i++) {
                if (arr[i].charAt(m-1)=='R'){
                    count++;
                    arr[i] = arr[i].substring(0, m-1) + 'D' ;
                }
            }
            for (int i = 0; i < m; i++) {
                if (arr[n-1].charAt(i)=='D'){
                    count++;
                    arr[n-1] = arr[n-1].substring(0, i) + 'R' + arr[n-1].substring(i + 1);
                }
            }
            System.out.println(count);

        }
    }
}

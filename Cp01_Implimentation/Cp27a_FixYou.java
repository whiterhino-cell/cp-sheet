package Cp01_Implimentation;

import java.util.Scanner;

public class Cp27a_FixYou {

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
            char arr[][]=new char[n][m];
            for (int i = 0; i < n; i++) {
                String str= sc1.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j]= str.charAt(j);
                }
            }

            int count=0;
            for (int i = 0; i < n; i++) {
                if (arr[i][m-1]=='R'){
                    count++;arr[i][m-1]='D';
                }
            }
            for (int i = 0; i < m; i++) {
                if (arr[n-1][i]=='D'){
                    count++;arr[n-1][i]='R';
                }
            }
            System.out.println(count);
        }
    }
}

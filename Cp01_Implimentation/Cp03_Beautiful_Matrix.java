package Cp01_Implimentation;

import java.util.Scanner;

public class Cp03_Beautiful_Matrix {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int arr[][]=new int[5][5];
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            arr[i][j]= sc.nextInt();
         }
      }
      int x=0,y=0;
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            if (arr[i][j]==1){
               x=i+1;
               y=j+1;
               break;
            }
         }
      }
      int ans=0;
      ans+=(x<3)?(3-x):(x-3);
      ans+=(y<3)?(3-y):(y-3);
      System.out.println(ans);
   }
}

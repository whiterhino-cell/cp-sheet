package Cp01_Implimentation;

import java.util.Scanner;

public class Cp07_FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt(),y= sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i%2==0){
                    System.out.print("#");
                }else if (i%4==1){
                    if (j==y-1)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }else if (i%4==3){
                    if (j==0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

package Cp01_Implimentation;

import java.util.Scanner;

public class Cp08_AntonPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        int n= sc.nextInt();
        while (n-->0){
            String ch= sc.next();
            switch (ch){
                case "Tetrahedron":ans+=4;break;
                case "Cube":ans+=6;break;
                case "Octahedron":ans+=8;break;
                case "Dodecahedron":ans+=12;break;
                case "Icosahedron":ans+=20;break;
            }
        }
        System.out.println(ans);

    }
}

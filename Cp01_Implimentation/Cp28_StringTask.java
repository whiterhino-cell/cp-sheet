package Cp01_Implimentation;

import java.util.Scanner;

public class Cp28_StringTask {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        String str= sc1.next(),ans="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':;
                case 'Y':break;
                default:
                    if (Character.isUpperCase(ch)){
                        ans+="."+(char)(ch+' ');
                    }else {
                        ans+="."+ch;
                    }
            }
        }
        System.out.println(ans);
    }
}

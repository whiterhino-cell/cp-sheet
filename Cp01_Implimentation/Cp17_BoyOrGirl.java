package Cp01_Implimentation;

import java.util.HashMap;
import java.util.Scanner;

public class Cp17_BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        int flag=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (char ch :s.toCharArray()) {
            if (hashMap.get(ch)==null) {
                hashMap.put(ch, 1);flag++;
            }
        }
//        System.out.println(flag);
        if (flag%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
    }
}


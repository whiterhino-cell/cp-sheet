package Cp01_Implimentation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

public class Cp25_ErasingZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            String str= sc.next();
            int max=0;
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            for (int i = 0; i <str.length(); i++) {
                if (str.charAt(0)=='-')continue;
                if (hashMap.get(1)==null){
                    if (str.charAt(i)=='1'){
                        hashMap.put(1,i);
                    }
                }else {
//                    System.out.print(t+" ");
                    if (str.charAt(i)=='1') {
//                        System.out.println("d");
                        int ans =  i - hashMap.get(1) -1;
                        max +=ans;
                        hashMap.put(1,i);
                    }
                }
            }
            System.out.println(max);
        }
    }
}

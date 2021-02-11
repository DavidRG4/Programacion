package com.company.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejextra2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] n1={1,2,3,4,5};
        int[] n2={1,2,3,4};
        System.out.println(Arrays.toString( unirvector(n1,n2)));


    }
    public static int[] unirvector(int []a, int[]b){
        int [] n3=new int[a.length+ b.length];
        for (int i = 0; i < n3.length ; i++) {
            if (i< n3.length- b.length){
                n3[i]=a[i];
            }else {
                n3[i]=b[i];
            }
        }
        return n3;
    }
}

package com.company;

import java.util.Scanner;

public class Ej1_Java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("Dime la altura de los calcetines: ");
        n1= sc.nextInt();
        n2=n1-2;
        for (int i = 0; i <n1 ; i++) {
            if(i==n2 || i==n2+1){
                System.out.println("****** ******");
            }else{
                System.out.println("***    ***");
            }
        }

    }
}

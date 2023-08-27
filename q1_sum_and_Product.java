/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;

import java.util.Scanner;

public class Q1_sum_and_product {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any inetger : ");
        int n=sc.nextInt();
        System.out.print("Number is : ");
        System.out.println(n);
        int s=0,p=1;
        int r;
        while(n!=0){
            r=n%10;
            n=n/10;
            s+=r;
            p*=r;
        }
        System.out.println("Sum of digit is : "+s);
        System.out.println("Product of digit is : "+p);
    }
}

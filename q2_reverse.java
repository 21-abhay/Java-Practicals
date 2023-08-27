/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;

import java.util.Scanner;

public class Q2_reverse {
    public static void main(String arg[]){
        System.out.print("Enter any number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        System.out.print("Revrse of the number is :");
        while(n!=0){
            r=n%10;
            n=n/10;
            System.out.print(+r);
        }
        System.out.println("\n");
    }
}

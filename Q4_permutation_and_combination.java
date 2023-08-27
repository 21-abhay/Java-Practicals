/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;

import java.util.Scanner;

public class Q4_permutation_and_combination {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter n= ");
int n=sc.nextInt();
    System.out.print("Enter r = ");
int r=sc.nextInt();
int n1=1,r1=1,r2=1;
for(int i=1;i<=n;i++){
n1*=i;
}
for(int i=1;i<=r;i++){
r1*=i;
}
for(int i=1;i<=n-r;i++){
r2*=i;
}
double p=n1/r2;
double c=n1/(r1*r2);
    System.out.println("Permutation = "+p);
    System.out.println("Combination = "+c);

}
}

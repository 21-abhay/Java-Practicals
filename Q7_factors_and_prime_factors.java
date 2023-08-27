/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.Scanner;
public class Q7_factors_and_prime_factors {
public static int prime(int n){
int f=0;
for(int i=2;i<=n/2;i++){
int r=n%i;
if(r==0){
f=1;
break;
}
}
return f;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter number : ");
int n=sc.nextInt();
int i=1,j=0;
int f[]=new int[n/2];;
    System.out.print("Factors of "+n +" = ");
while(i<=n/2){
int r=n%i;
if(r==0){
    System.out.print(" "+i);
f[j]=i;
j++;
}
i++;
}
    System.out.println(" "+n);
    System.out.print("\n\nPrime Factors are = ");
for(int x:f){
int p=prime(x);
if(p==0){
    System.out.print(" "+x);
}
}
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;

import java.util.*;
public class Q3_1_sum_of_first_n_terms {
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
    System.out.println("\n(1).  1+1/2+1/3+....\n(2). 1+1/2!+1/3!+....");
    System.out.println("(3). 1-2+3-4+.....");
    System.out.print("\nEnter (1-3) choice : ");
int c=sc.nextInt();

if(c==1){
    System.out.print("enter number of term in the series : ");
int n=sc.nextInt();
double s=0;
for(int i=1;i<=n;i++){
double j=1.0/i;
s+=j;
}
    System.out.println("\n\nSumber of the n-terms : "+s);
}

else if(c==2){
    System.out.print("\n\nEnter number of terms in the series : ");
int n=sc.nextInt();
double s=0;
for(int i=1;i<=n;i++){
int p=1;
for(int j=1;j<=i;j++){
p*=j;
}
double k=1.0/p;
s+=k;
}
    System.out.println("\n\nSum of the n-terms of the series : "+s);
}

else{
    System.out.print("\n\nEnter number of  in the series : ");
int n=sc.nextInt();
int s=0;
for(int i=1;i<=n;i+=2){
int j=i+1;
int k=i-j;
s+=k;
}
if(n%2!=0){
s+=n+1;
}
    System.out.println("Sum of terms in the series : "+s);
}

}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.*;
public class Q6_Prime_number {
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
        System.out.println("1.To check any number is prime or not.\n2.To print n-prime numbers.\n3.To print prime numbers upto n.\n4.To print n-prime numbers form m.\n\nEnter any choice from above : ");
int c=sc.nextInt();


if(c==1){
        System.out.print("Enter number : ");
int n=sc.nextInt();
int f=prime(n);
if(f==1){
    System.out.println("The number is not prime.");
}
else{
    System.out.println("The number is prime.");
}
}

if(c==2){
System.out.print("Enter how many prime want to print : ");
int n1=sc.nextInt();
int i=1;
int p=2;
while(i<=n1){
int f1=prime(p);
if(f1==0){
    System.out.println(+p);
i++;
}
p++;
}
}

if(c==3){
System.out.print("Enter number upto which want to print prime numbers : ");
int n2=sc.nextInt();
int j=2;
while(j<=n2){
int f2=prime(j);
if(f2==0){
    System.out.println(+j);
}
j++;
}
}

if(c==4){
    System.out.print("Enter how many prime numbers want to print : ");
int n3=sc.nextInt();
    System.out.print("Enter number from which want to print prime numbers : ");
int m=sc.nextInt();
int k=1;
while(k<=n3){
int f3=prime(m);
if(f3==0){
    System.out.println(+m);
k++;
}
m++;
}
}

}
}

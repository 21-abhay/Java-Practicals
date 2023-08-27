/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.Scanner;
public class Q8__gcd {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.println("Enter two numbers : ");
int n1=sc.nextInt();
int n2=sc.nextInt();
int r,q,a;
r=n1%n2;
while(r>0){
r=n1%n2;
q=n1/n2;
n1=n2;
if(r!=0){
n2=r;
}
}
    System.out.println("GCD is :"+n2);

}
}

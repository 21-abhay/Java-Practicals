/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.*;
public class Q9_fibonacci_series {
    public static void fibonacci(int n){
int k=0,j=1;
for(int i=1;i<=n;i++){
    System.out.print(" "+j);
int p=j;
j+=k;
k=p;
}
        System.out.println("\n");
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of terms in series : ");
int n=sc.nextInt();
fibonacci(n);
}
}

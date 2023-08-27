/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.*;
public class Q_11_decimal_to_binary {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimal number to convert into binary : ");
int n=sc.nextInt();
int x=0,i=0;
int y=n;
while(y!=0){
y=y/2;
x++;
}
int a[]=new int[x];
int l=a.length;
        System.out.println("\n\nsize of the array : "+l);
while(n>0){
int r=n%2;
    System.out.print(+r);
a[i]=r;
i++;
n=n/2;
}
        System.out.print("\n\nDecimal to binary : ");
for(int j=x-1;j>=0;j--){
    System.out.print(a[j]);
}
        System.out.println("\n");
}
}

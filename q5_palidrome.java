/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;
import java.util.Scanner;
public class Q5_palidrome {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter the word : ");
String s=sc.nextLine();
int f=0;
int l=s.length();
for(int i=0,j=l-1;i<l;i++,j--){
if(s.charAt(i)==s.charAt(j)){
f=1;
continue;
}
else{
f=0;
break;
}
}
if(f==1){
    System.out.println("The string is palidrome.");
}
else{
    System.out.println("the string is not a palidrome.;");}
}

}

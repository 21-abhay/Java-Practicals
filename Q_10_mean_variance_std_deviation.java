/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicals;

import java.util.Scanner;

public class Q_10_mean_variance_std_deviation {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int n;
		double mean, SDD = 0, SD = 0, variance, meanAdd = 0;
		System.out.print("Enter the no of elements : ");
		n = sc.nextInt();
		System.out.print("Enter "+n+" elements : ");
		for (int i = 0 ; i < n ; i++)
		{
			a[i] = sc.nextInt();
		}		 	
		for (int i = 0 ; i < n ; i++)
		{
			meanAdd = meanAdd + a[i];
		}
		mean = meanAdd/n;
		System.out.println("Mean is "+mean);
		for (int i = 0; i < n; i++)  
		{
            		SDD += (a[i] - mean) *  (a[i] - mean); 
		}
		variance = (double)SDD / n;
		System.out.println("Variance is "+variance);
		SD = Math.sqrt(variance);
		System.out.println("Standard Deviation is "+SD);
	}
}

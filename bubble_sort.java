import java.io.*;
import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
        Scanner as=new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		int n=as.nextInt();
		int a[]=new int[n];
		int i;
		
		System.out.println("Enter elements of array:");
		for(i=0;i<n;i++) {
			a[i]=as.nextInt();
		}
		
		int j;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}
		}
		
		System.out.println("Sorted array:");
		for(i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

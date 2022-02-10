import java.io.*;
import java.util.Scanner;

public class longest_sub {

	public static void main(String[] args) {
        Scanner cba=new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		int n=cba.nextInt();
		int a[]=new int[n];
		int i;
		
		System.out.println("Enter elements of array:");
		for(i=0;i<n;i++) {
			a[i]=cba.nextInt();
		}
		
		int b[]=new int[100];

		int k=0,c=1;
		for(i=1;i<n;i++) {
			
			if(a[i]>a[i-1]) {
				c=c+1;
				continue;
			}
			
			else {
				b[k]=c;
				k=k+1;
				c=0;
			}
		}
		int l=b.length;
		int m=0;
		for(i=1;i<l;i++) {
			if(b[i]<b[i-1])
				m=b[i-1];
				
		}
		System.out.println("The longest continuous ascending order is of size:");
		System.out.println(m);

	}

}

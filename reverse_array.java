import java.io.*;
import java.util.*;
public class reverse_array {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		int n=xyz.nextInt();
		int a[]=new int[n];
		int i;
		
		System.out.println("Enter elements of array:");
		for(i=0;i<n;i++) {
			a[i]=xyz.nextInt();
		}
		
		System.out.println("Reverse array:");
		int j=n;
		int b[]=new int[j];
		for(i=0;i<n;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		
		for(i=0;i<n;i++) {
			System.out.print(b[i]+" , ");
		}
	}
}

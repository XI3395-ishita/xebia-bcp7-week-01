import java.io.*;
public class quickSort {
	static void swap(int[]  a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	
	static int partition(int[] a, int low,int high) {
		int pivot=a[high];
		int i=low-1;
		int j;
		for(j=low;j<high-1;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i+1,high);
			}
		}
		swap(a,i+1,high);
		return(i+1);
	}
	
	static void quick(int[] a, int low,int high) {
		if(low<high) {
			int pi=partition(a,low,high);
			quick(a,low,pi-1);
			quick(a,pi+1,high);
		}
	}
	
	static void display(int[] a,int size) {
		int i;
		for(i=0;i<size;i++) {
			System.out.print(a[i]+" ");
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {10,7,4,2,1};
		int n=a.length;
		quick(a,0,n-1);
		System.out.println("Sorted array");
		display(a,n);

	}

}

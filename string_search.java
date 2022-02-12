import java.io.*;
import java.util.*;
public class string_search {
	
	static String str[]= {"bb","cc","aa"};
	static int min=0;
	static int max=str.length -1;
	static int mid;
	static String a="cc";

	public static void main(String[] args) {
		
		System.out.println("String found at: "+stringBinarySearch()+" position");
	}
	
	public static int stringBinarySearch() {
		
		while(min<=max) {
			mid=(min+max)/2;
			if(str[mid].compareTo(a)<0) 
				min=mid+1;
			
			else if(str[mid].compareTo(a)>0)
				max=mid-1;
			
			else
				return mid;
		}
		
		return -1;
	}

}

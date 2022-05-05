//Q1

import java.util.*;

class Q1{
	
	
	static void display(int arr[]){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	static void sorting(int a[], int n){
	int last=a[n-1];
	for(int i=n-2; i>=0;i--){
		if(a[i]>last){
			a[i+1]=a[i];
			display(a);
		}
		else{
			a[i+1]=last;
			display(a);
			break;
		}
		if((i==0)&& (a[i]>last)){
			a[i]=last;
			display(a);
		}
	}
		
	}
	
	
	public static void main(String... args){
		//System.out.println("ehllo");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		//display(arr);
		
		sorting(arr,n);
		
		//display(arr);
	}

}
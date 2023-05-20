package kiran1;
import java.util.Scanner;
public class binary_search {
	Scanner m= new Scanner(System.in);
	int n=m.nextInt();
	public static void main(String[] args) {
		binary_search f= new binary_search();
		Scanner m= new Scanner(System.in);
		int arr[]=new int[100];
		//int n=f.no_of();			
		for(int i=0;i<f.n;i++) {
			System.out.print("enter element in index "+i+" :");
			arr[i]=m.nextInt();
		}
		System.out.print("enter key to find:");
		int key=m.nextInt();
		int v=f.binary(arr,key);
		if(v==1) {
			System.out.print("enterd key is found");	
		}
		else {
			System.out.print("not found");
		}
		m.close();
	}
	//*public int no_of() {
	//	Scanner m= new Scanner(System.in);
		//System.out.print("enter n:");
		//int n=m.nextInt();
		//return n;
		
	//}
	
	public int binary(int arr[],int key) {
		//binary_search f= new binary_search();
		int beg=0;
		int last=n;
		int mid=(beg+last)/2;
		int flag=0;
		//System.out.println(arr[mid]);
		//System.out.println(mid);
		//System.out.println(n);
		while(beg<last) {
			
			if(arr[mid]==key) {
				flag=1;	
				break;
			}
			else if(arr[mid]>key) {
				last=mid-1;
			}
			else if(arr[mid]<key) {
				beg=mid+1;
			}
			mid=(beg+last)/2;
		}
		return flag;
	}
}
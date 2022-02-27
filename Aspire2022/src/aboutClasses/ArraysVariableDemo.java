package aboutClasses;

public class ArraysVariableDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		ArraysVariableDemo obj=new ArraysVariableDemo();
		
		//System.out.println("Before passing array...." + arr[2]);
		//obj.pass(arr);//By default arrays are passed by reference
		//System.out.println("After passing array....:" + arr[2]);
		
		//Solution
		//1. Use anonymous array
		obj.pass(new int[] {54, 78, 89, 67});
		
		//2. Use System.arrCopy
		int arrcop[]=new int[4];
		System.arraycopy(arr, 0, arrcop, 0, 4);
		
		System.out.println("Before passing array...." + arr[2]);
		obj.pass(arrcop);//By default arrays are passed by reference
		System.out.println("After passing array....:" + arr[2]);
		
		System.out.println(arr[2]);
		System.out.println(arrcop[2]);
	}
	
	void pass(int a[]) {
		a[2]=999999;
	}

}

package Exercise_1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,5,7,9};
		System.out.println("Array befor swap");
		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]+ " ");	
		}
		System.out.println("Array after swap");
		for(int i= a.length-1;i>=0;i--) 
		{
			System.out.println(a[i]+" ");
			
		}
	}

}

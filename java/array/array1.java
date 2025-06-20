import java.util.Scanner;
class array1{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		int a[] = new int[10];
		int k=0;
		for (int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Printing the values");
		for(int i=0;i<a.length;i++){
			k+=a[i];
			
		}
		System.out.println(k);
		
	}
}
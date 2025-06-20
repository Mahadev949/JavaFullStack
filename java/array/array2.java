import java.util.Scanner;
class array2{
	public static void main(String[] args){
		int k=0;
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the 10 number");
		for(int i=0;i<a.length;i++){
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++){
			k+=a[i];
		}
		
		System.out.println(k/a.length);
	}
}
class array1_15{
	public static void main(String[] args){
		int k=0;
		int a[]={1,2,3,4,5,6,7,8}
		System.out.println("Enter the 10 number");
		for(int i=0;i<a.length;i++){
			k+=a[i];
		}
		
		System.out.println(k/a.length);
	}
}
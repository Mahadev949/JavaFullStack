class array1_3{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,0};
		int b=0,c=0;
		for (int i=0;i<a.length;i++){
			if (b>a[i]){
				b=a[i];
			}
			if(c<a[i]){
				c=a[i];
			}
			
		}
		System.out.println("Largest number:-"+c);

		System.out.println("Smallest number:-"+b);
	}
}
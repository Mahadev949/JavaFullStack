class array6{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,0};
		int b[]=new int[10];
		for (int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		for (int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		
		
	}
}
class array9{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7};
		int b[]=new int[a.length+1];
		for (int i=0;i<a.length;i++){
			b[i]=a[a.length-i-1];		
		}
		for (int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}
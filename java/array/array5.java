class array5{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,0};
		int b=3;
		for (int i=0;i<a.length;i++){
			if (a[i]==b){
				a[i]=0;
			}
		}
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
}
class array4{
	public static void main(String[] arg){
		int a[]={1,2,3,4,5,6,63,7,8,9};
		int b=7,c=0;
		for (int i=0;i<a.length;i++){
			if (a[i]==b){
				System.out.println("element Exists");
				c=1;
			}
		}
		if (c==0){
			System.out.println("element Not found");
		}
	}
}
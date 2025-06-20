class array1_3{
	public static void main(String[] args){
		int a=0,b=0,c=0;
		int arr[]={34,2534,547,5434,53,453,64,57,58,568,468,56,8,54,673,4,6,4346,5325,123,5,15345,3246,45,7,547,5,7,37,5474};
		
		for (int i=0;i<arr.length;i++){
			if(a<arr[i]){
				b=a;
				a=arr[i];
								
			}				
		}
		System.out.println(b);
	}
}
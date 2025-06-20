class array1_2{
	public static void main(String[] args){
		int a=0,b=0,c=0;
		int arr[]={1,2,3,4,5,6,7,8,9,0};
		
		for (int i=0;i<arr.length;i++){
			if(a<arr[i]){
				b=a;
				a=arr[i];
								
			}				
		}
		System.out.println(b);
	}
}
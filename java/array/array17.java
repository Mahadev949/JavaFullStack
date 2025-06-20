class array17{
	public static void main(String[] args){
		int a=0,b=0,c=0;
		int arr[]={1,2,23,4,5,6,7,8,9,0};
		int arr2[]={12,23};
		
		for (int i:arr){
			for(int j:arr2){
				if (i==j){
					System.out.println(j+" Element is there");
			}
			}
												
		}
		
	}
}
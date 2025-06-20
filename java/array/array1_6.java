class array1_6{
	public static void main(String[] args){
		int a=0,b=0;
		int arr[]={1,2,3,4,5,6,7,8,9,0};
		
		for (int i=0;i<arr.length;i++){
			if (arr[i]%2==0){
				a++;
			}
			else{
				b++;
			}
		}
		System.out.println("The No of Evens :"+a+"\nThe no of odds :"+b);
	}
}
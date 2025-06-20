class array1_12{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9};
		int s=0;
		for (int i:a){
			if(i%2==0){
				s+=i;
			}
		}
		System.out.println(s);
	}
}
class array1_7{
	public static void main(String[] args){
		int a[]={1,-2,0,0,-1,-35,23,234};
		int p=0,n=0,z=0;
		for (int i:a){
			if (i<0){
				n++;				
			}
			else if(i>0){
				p++;
			}
			else{
				z++;
			}
		}
		System.out.println("No of Positive numbers "+p+"\nNo of Negative numbers "+n+"\nNo of Zeros "+z);
	}
}